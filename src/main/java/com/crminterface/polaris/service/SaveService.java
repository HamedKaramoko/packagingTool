/**
 * 
 */
package com.crminterface.polaris.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.crminterface.polaris.dao.ApplicationConfigurationDAO;
import com.crminterface.polaris.model.ApplicationConfiguration;
import com.crminterface.polaris.model.IS;
import com.crminterface.polaris.model.SFTPparameter;

/**
 * @author hamedkaramoko
 *
 */
@Transactional
@Path("/SaveService")
public class SaveService {
	
	@Autowired
	private ApplicationConfigurationDAO applicationConfDAO;

	@GET
	@Path("/testSave")
	public Response testSave(){
		ApplicationConfiguration appConf = new ApplicationConfiguration();
		IS isFacade = new IS();
		isFacade.setName("DEV2");
		isFacade.setHost("http://frrnspoldev");
		isFacade.setPort("15880");
		isFacade.setOutBoundPackagePath("/exec/applis/EAI_Backbone_DEV2/G9R2C0/IS/order/TPC_ORDER_SYNC_02/IntegrationServer/replicate/outbound");
		SFTPparameter sftpFacade = new SFTPparameter();
		sftpFacade.setHost("frrnspoldev");
		sftpFacade.setPort("22");
		sftpFacade.setUsername("root");
		sftpFacade.setPassword("root01");
		
		Set<IS> isList = new HashSet<IS>();
		isList.add(isFacade);
		
		appConf.setProjectName("Facade");
		appConf.setIsList(isList);
		appConf.setInternDelivery("\\\\sf2coeur\\RNS-OBS-TMA-POLARIS\\6 Delivery Projet\\609 DÈploiement\\Version FACADE\\G2016-10\\");
		appConf.setPropertiesPath("\\\\sf2coeur\\RNS-OBS-TMA-POLARIS\\6 Delivery Projet\\609 DÈploiement\\_SVN WORKING COPY - trunk\\polarisFacade\\delivery\\Polaris_int.properties");
		appConf.setRessourceFile("PolarisDBVPN_Resources.xml");
		appConf.setLastDeliveryVersion("G2016-10");
		appConf.setCurrentDeliveryVersion(null);
		appConf.setSftpParameter(sftpFacade);
		
		applicationConfDAO.saveProject(appConf);
		
		return Response.status(Status.OK).entity(appConf).build();
	}
}
