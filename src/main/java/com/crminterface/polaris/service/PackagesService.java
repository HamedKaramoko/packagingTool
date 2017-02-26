/**
 * 
 */
package com.crminterface.polaris.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crminterface.polaris.dao.ProjectJAXBDAOImpl;
import com.crminterface.polaris.model.DefaultParameters;
import com.crminterface.polaris.model.CustomException;
import com.crminterface.polaris.model.IntegrationServer;
import com.crminterface.polaris.model.PackageInfoList;
import com.crminterface.polaris.model.Project;
import com.crminterface.polaris.resourcesmodel.PackageElement;
import com.crminterface.polaris.resourcesmodel.Resources;
import com.crminterface.polaris.utils.Helper;
import com.crminterface.polaris.utils.PropertiesLoader;
import com.crminterface.polaris.utils.SFTPUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;




/**
 * @author hkaramok
 *
 */
@Transactional
@CrossOriginResourceSharing(
		allowAllOrigins = true, 
		allowCredentials = true, 
		exposeHeaders = { "X-custom-3", "X-custom-4" }
		)
@Path("/packageService")
@Api(value="packageService")
@Produces("application/json")
@Component
public class PackagesService {

	@Autowired
	private ProjectJAXBDAOImpl projectjaxBDAO;

	private static Logger LOGGER = LoggerFactory.getLogger(PackagesService.class);

	@POST
	@Path("/copyDeliveryFolder")
	@ApiOperation(value="/copyDeliveryFolder", notes="Packaging process")
	public Response copyDeliveryFolder(@ApiParam(name = "projectName") @QueryParam("projectName") String projectName){

		CustomException exception = null;

		Project project = projectjaxBDAO.getProject(projectName, DefaultParameters.parameters.getProjectConfigurationPath());
		if(project != null){
			LOGGER.debug("***********************  Copying delivery folder  ***************************");
			Helper.copyDirectory(project.getInternDelivery(), project.getCurrentDeliveryVersion(), DefaultParameters.parameters.getDeleteDeliveryFolder());
			return Response.status(Status.OK).build();
//			if(Helper.copyDirectory(project.getInternDelivery(), project.getCurrentDeliveryVersion(), DefaultParameters.parameters.getDeleteDeliveryFolder())){
//				return Response.status(Status.OK).build();
//			}else
//				exception = new CustomException("The delivery folder already exists. \n If you want to overwrite the existing folder, change your application configuration.");
		}else
			exception = new CustomException("No project found for the projectName : " + projectName + ".");

		return Response.status(Status.NOT_FOUND).entity(exception).build();
	}

	@POST
	@Path("/packaging")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(value="/packaging", notes="Packaging process")
	synchronized public Response packaging(@ApiParam(name = "projectName")
	@QueryParam("projectName") String projectName, @ApiParam(name = "integrationServerName")
	@QueryParam("integrationServerName") String integrationServerName, @ApiParam(name = "updatedPackages") PackageInfoList updatedPackages){

		CustomException exception = null;

		Project project = projectjaxBDAO.getProject(projectName, DefaultParameters.parameters.getProjectConfigurationPath());

		if(project != null){
			IntegrationServer intServ = null;
			for(IntegrationServer integrationServer : project.getIntegrationServers()){
				if(integrationServerName.equals(integrationServer.getName())){
					intServ = integrationServer;
					break;
				}
			}
			if(intServ != null){
				LOGGER.debug("***********************  Packaging process  ***************************");
				Map<String, String> propertiesMap = PropertiesLoader.loadPropertiesInMap(project.getPropertiesPath());

				if(propertiesMap != null){

					Resources resourcesObject = Helper.getResourcesFileAsObject(project.getRessourceFile());
					if(resourcesObject != null){
						Set<String> warning = new HashSet<String>();
						Map<String, Set<PackageElement>> resultFromResources = Helper.getPackagesInResources(resourcesObject, updatedPackages.getPackageInfos(), intServ.getSuffix());
						
						Set<PackageElement> packageUpdatedInResourcesFile = resultFromResources.get("present");
						
						Set<PackageElement> packageUpdatedNotInResourcesFile = resultFromResources.get("notPresent");
						
						if(packageUpdatedNotInResourcesFile != null){
							Set<String> pkgNotPresent = new HashSet<String>();
							for(PackageElement pkg : packageUpdatedNotInResourcesFile){
								pkgNotPresent.add(pkg.getName());
							}
							warning.add(pkgNotPresent.toString()+ " : not present in resources file.");
						}
						
						List<String> specialCharacters = new ArrayList<String>();
						specialCharacters.add("[%");
						specialCharacters.add("%]");
						packageUpdatedInResourcesFile = Helper.removeSpecialCharacterOfPackagesList(packageUpdatedInResourcesFile, specialCharacters);

						String serverPath = intServ.getOutBoundPackagePath();
						String destPath = project.getCurrentDeliveryVersion();
						String[] separatedHost = intServ.getHost().split("://");

						String host = separatedHost[separatedHost.length-1];

						SFTPUtils.connection(host , intServ.getSftpParameter().getPort(), intServ.getSftpParameter().getUsername(), intServ.getSftpParameter().getPassword(), serverPath);

						for(PackageElement pkg : packageUpdatedInResourcesFile){
							String rightPath = propertiesMap.get(pkg.getDir());
							if(StringUtils.equals(rightPath, null)){
								warning.add(pkg.getId() + " : ["+ pkg.getDir() +"] absent in properties file.");
							}else{
								SFTPUtils.download(pkg.getFile(), destPath+rightPath+"\\"+pkg.getFile());
							}
						}
						return Response.status(Status.OK).entity(warning).build();
					} else
						exception = new CustomException("Resources file is empty.");
				}else
					exception = new CustomException("The properties file is empty.");
			}else
				exception = new CustomException("No integrationServer [" + integrationServerName + "] found for the projectName : " + projectName + ".");
		}else
			exception = new CustomException("No project found for the projectName : " + projectName + ".");

		return Response.status(Status.NOT_FOUND).entity(exception).build();

	}
}
