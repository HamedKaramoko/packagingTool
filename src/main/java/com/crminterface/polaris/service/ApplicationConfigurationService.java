/**
 * 
 */
package com.crminterface.polaris.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBException;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.crminterface.polaris.dao.ApplicationConfigurationDAO;
import com.crminterface.polaris.model.ApplicationConfiguration;
import com.crminterface.polaris.utils.JAXBUtils;

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
@Path("/ApplicationConfigurationService")
@Api(value="ApplicationConfigurationService")
public class ApplicationConfigurationService {

	@Autowired
	private ApplicationConfigurationDAO applicationConfDAO;

	@Autowired
	private DozerBeanMapper mapper;
	
	@Autowired
	private JAXBUtils<Set<ApplicationConfiguration>> jaxbUtils;

	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationConfigurationService.class);

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/getAll", notes="Get all the application configuration")
	public Response getAll() throws JAXBException{

		//List<ApplicationConfiguration> appConfList = applicationConfDAO.getAllApplicationConfiguration();
		Set<ApplicationConfiguration> appConfList = new HashSet<ApplicationConfiguration>();
		jaxbUtils.convertXMLFileToObject("D:\\packagingTest\\applicationConf.xml", appConfList);
		LOGGER.debug("List of application configuration : {}", appConfList);

		return Response.status(Status.OK).entity(appConfList).build();
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/get", notes="Get application configuration by projectName")
	public Response get(@ApiParam(name = "projectName")
	@QueryParam("projectName") String projectName){

		ApplicationConfiguration appConf = applicationConfDAO.findByProjectName(projectName);
		LOGGER.debug("List of application configuration : {}", appConf);

		return Response.status(Status.OK).entity(appConf).build();
	}

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/create", notes="Create an application configuration", response=ApplicationConfiguration.class)
	public Response create(@ApiParam(name = "applicationConfiguration") ApplicationConfiguration applicationConfiguration) throws JAXBException{

		ApplicationConfiguration appCreated = applicationConfDAO.createApplicationConfiguration(applicationConfiguration);
		//JAXBUtils.convertObjectToXmlFile(applicationConfiguration, "app.xml");

		return Response.status(Status.OK).entity(appCreated).build();
	}

	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/update", notes="Update an application configuration")
	public Response update(@ApiParam(name = "projectName")
	@QueryParam("projectName") String projectName, @ApiParam(name = "applicationConfiguration")
	@QueryParam("applicationConfiguration") ApplicationConfiguration applicationConfiguration){

		ApplicationConfiguration appToUpdate = applicationConfDAO.findByProjectName(projectName);

		if(appToUpdate != null){
			appToUpdate = mapper.map(applicationConfiguration, ApplicationConfiguration.class);
		}

		return Response.status(Status.OK).build();
	}
}
