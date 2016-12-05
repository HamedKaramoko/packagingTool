package com.crminterface.polaris.dao;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import com.crminterface.polaris.model.ApplicationConfigurationList;

public interface ApplicationConfigurationJAXBDAO {
	public ApplicationConfigurationList getAllApplicationConfiguration(String XmlFilePath)  throws JAXBException;
	public void createApplicationConfiguration(ApplicationConfigurationList appConfList, String XmlFilePath) throws JAXBException, IOException;
}
