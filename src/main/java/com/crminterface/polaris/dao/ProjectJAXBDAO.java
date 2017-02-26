package com.crminterface.polaris.dao;

import java.io.IOException;
import java.util.Set;

import javax.xml.bind.JAXBException;

import com.crminterface.polaris.model.Project;
import com.crminterface.polaris.model.ProjectList;

public interface ProjectJAXBDAO {
	public Project getProject(String projectName, String XmlFilePath);
	public Set<Project> getAllProject(String XmlFilePath)  throws JAXBException;
	public void createProject(Project appConf, String XmlFilePath) throws JAXBException, IOException;
	public void createAllProject(ProjectList appConfList, String XmlFilePath) throws JAXBException, IOException;
	public void updateProject(Project oldAppConf, Project newAppConf, String XmlFilePath) throws JAXBException, IOException;
}
