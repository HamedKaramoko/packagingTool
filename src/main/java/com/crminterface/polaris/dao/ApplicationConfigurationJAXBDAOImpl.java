package com.crminterface.polaris.dao;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crminterface.polaris.model.ApplicationConfigurationList;
import com.crminterface.polaris.utils.JAXBUtils;

@Repository
public class ApplicationConfigurationJAXBDAOImpl implements ApplicationConfigurationJAXBDAO {

	@Autowired
	private JAXBUtils<ApplicationConfigurationList> jaxbUtils;

	@Override
	public ApplicationConfigurationList getAllApplicationConfiguration(String XmlFilePath) throws JAXBException {
		ApplicationConfigurationList appConfList = new ApplicationConfigurationList();
		return jaxbUtils.convertXMLFileToObject(XmlFilePath, appConfList);
	}

	@Override
	public void createApplicationConfiguration(ApplicationConfigurationList appConfList, String XmlFilePath) throws JAXBException, IOException {
		jaxbUtils.convertObjectToXmlFile(appConfList, XmlFilePath);
	}

}
