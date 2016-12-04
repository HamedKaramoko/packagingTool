/**
 * 
 */
package com.crminterface.polaris.service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.crminterface.polaris.dao.ApplicationConfigurationDAO;
import com.crminterface.polaris.model.ApplicationConfiguration;
import com.crminterface.polaris.model.IntegrationServer;
import com.crminterface.polaris.model.SFTPparameter;
import com.crminterface.polaris.utils.JAXBUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author hamedkaramoko
 *
 */
@Transactional
@Path("/SaveService")
@Api(value="SaveService")
public class SaveService {
	
	@Autowired
	private ApplicationConfigurationDAO applicationConfDAO;
	
	@Autowired
	private JAXBUtils<Set<ApplicationConfiguration>> jaxbUtils;

	@POST
	@Path("/testSave")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/testSave", notes="Save an application configuration")
	public Response testSave() throws JAXBException, IOException{
		ApplicationConfiguration appConf = new ApplicationConfiguration();
		IntegrationServer isFacade = new IntegrationServer();
		isFacade.setName("DEV2");
		isFacade.setHost("http://frrnspoldev");
		isFacade.setPort("15880");
		isFacade.setOutBoundPackagePath("/exec/applis/EAI_Backbone_DEV2/G9R2C0/IS/order/TPC_ORDER_SYNC_02/IntegrationServer/replicate/outbound");
		IntegrationServer isFacade2 = new IntegrationServer();
		isFacade2.setName("INT");
		isFacade2.setHost("http://frrnspolint");
		isFacade2.setPort("5880");
		isFacade2.setOutBoundPackagePath("/exec/applis/EAI_Backbone_DEV2/G9R2C0/IS/order/TPC_ORDER_SYNC_02/IntegrationServer/replicate/outbound");
		SFTPparameter sftpFacade = new SFTPparameter();
		sftpFacade.setHost("frrnspoldev");
		sftpFacade.setPort("22");
		sftpFacade.setUsername("root");
		sftpFacade.setPassword("root01");
		
		Set<IntegrationServer> isList = new HashSet<IntegrationServer>();
		isList.add(isFacade);
		isList.add(isFacade2);
		
		appConf.setProjectName("Facade");
		appConf.setDescription("C'est le DEV2 de polaris.");
		appConf.setIsList(isList);
		appConf.setInternDelivery("\\\\sf2coeur\\RNS-OBS-TMA-POLARIS\\6 Delivery Projet\\609 DÈploiement\\Version FACADE\\G2016-10\\");
		appConf.setPropertiesPath("\\\\sf2coeur\\RNS-OBS-TMA-POLARIS\\6 Delivery Projet\\609 DÈploiement\\_SVN WORKING COPY - trunk\\polarisFacade\\delivery\\Polaris_int.properties");
		appConf.setRessourceFile("PolarisDBVPN_Resources.xml");
		appConf.setLastDeliveryVersion("G2016-10");
		appConf.setCurrentDeliveryVersion(null);
		appConf.setSftpParameter(sftpFacade);
		
		//2
		ApplicationConfiguration appConf2 = new ApplicationConfiguration();
		appConf2.setProjectName("FacadeINT");
		appConf2.setDescription("C'est le DEV2 de polaris.");
		appConf2.setIsList(isList);
		appConf2.setInternDelivery("\\\\sf2coeur\\RNS-OBS-TMA-POLARIS\\6 Delivery Projet\\609 DÈploiement\\Version FACADE\\G2016-10\\");
		appConf2.setPropertiesPath("\\\\sf2coeur\\RNS-OBS-TMA-POLARIS\\6 Delivery Projet\\609 DÈploiement\\_SVN WORKING COPY - trunk\\polarisFacade\\delivery\\Polaris_int.properties");
		appConf2.setRessourceFile("PolarisDBVPN_Resources.xml");
		appConf2.setLastDeliveryVersion("G2016-10");
		appConf2.setCurrentDeliveryVersion(null);
		appConf2.setSftpParameter(sftpFacade);
		
		//applicationConfDAO.createApplicationConfiguration(appConf);
		Set<ApplicationConfiguration> appConfList = new HashSet<ApplicationConfiguration>();
		appConfList.add(appConf);
		appConfList.add(appConf2);
		
		//JAXBUtils<ApplicationConfiguration> jaxb = new JAXBUtils<ApplicationConfiguration>();
		
		jaxbUtils.convertObjectToXmlFile(appConfList, "D:\\packagingTest\\applicationConf.xml");
		
		
		return Response.status(Status.OK).entity(appConf).build();
	}
}
