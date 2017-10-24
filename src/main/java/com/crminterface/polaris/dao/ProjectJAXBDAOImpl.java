package com.crminterface.polaris.dao;

import java.io.IOException;
import java.util.Set;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crminterface.polaris.model.Project;
import com.crminterface.polaris.model.ProjectList;
import com.crminterface.polaris.utils.JAXBUtils;

@Repository
public class ProjectJAXBDAOImpl implements ProjectJAXBDAO {

	@Autowired
	private JAXBUtils<ProjectList> jaxbUtils;
	
	private static Logger LOGGER = LoggerFactory.getLogger(ProjectJAXBDAOImpl.class);

	@Override
	public Set<Project> getAllProject(String xmlFilePath) throws JAXBException {
		ProjectList appConfList = getWholeFile(xmlFilePath);
		if(appConfList == null){
			return null;
		}
		return appConfList.getProjectList();
	}

	@Override
	public void createProject(Project appConf, String xmlFilePath) throws IOException, JAXBException {
		ProjectList appConfList = null;
		try{
			appConfList = getWholeFile(xmlFilePath);
			if(appConfList == null){
				appConfList = new ProjectList();
			}
		} catch (JAXBException jaxe) {
			appConfList = new ProjectList();
		} finally {
			appConfList.getProjectList().add(appConf);
			jaxbUtils.convertObjectToXmlFile(appConfList, xmlFilePath);
		}
	}

	@Override
	public void createAllProject(ProjectList appConfList, String xmlFilePath) throws JAXBException, IOException{
		jaxbUtils.convertObjectToXmlFile(appConfList, xmlFilePath);
	}

	@Override
	public Project getProject(String projectName, String xmlFilePath){
		try{
			return getSpecificProject(projectName, xmlFilePath);
		}catch (JAXBException jaxbe) {
			LOGGER.debug("Project {} not found : {}", projectName, jaxbe);
			return null;
		}
	}

	private ProjectList getWholeFile(String xmlFilePath) throws JAXBException{
		ProjectList appConfList = new ProjectList();
		return jaxbUtils.convertXMLFileToObject(xmlFilePath, appConfList);
	}

	private Project getSpecificProject(String projectName, String xmlFilePath) throws JAXBException{
		ProjectList appConfList = getWholeFile(xmlFilePath);
		Project app = null;
		for(Project appConf : appConfList.getProjectList()){
			if(projectName.equals(appConf.getProjectName())){
				app = appConf;
				break;
			}
		}
		return app;
	}

	@Override
	public void updateProject(Project oldAppConf, Project newAppConf, String xmlFilePath)
			throws JAXBException, IOException {

		ProjectList appConfList = getWholeFile(xmlFilePath);

		appConfList.getProjectList().remove(oldAppConf);
		appConfList.getProjectList().add(newAppConf);

		createAllProject(appConfList, xmlFilePath);
	}

}
