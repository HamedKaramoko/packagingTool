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
	public Set<Project> getAllProject(String XmlFilePath) throws JAXBException {
		ProjectList appConfList = getWholeFile(XmlFilePath);
		if(appConfList == null){
			return null;
		}
		return appConfList.getProjectList();
	}

	@Override
	public void createProject(Project appConf, String XmlFilePath) throws IOException, JAXBException {
		ProjectList appConfList = null;
		try{
			appConfList = getWholeFile(XmlFilePath);
			if(appConfList == null){
				appConfList = new ProjectList();
			}
		} catch (JAXBException jaxe) {
			appConfList = new ProjectList();
		} finally {
			appConfList.getProjectList().add(appConf);
			jaxbUtils.convertObjectToXmlFile(appConfList, XmlFilePath);
		}
	}

	@Override
	public void createAllProject(ProjectList appConfList, String XmlFilePath) throws JAXBException, IOException{
		jaxbUtils.convertObjectToXmlFile(appConfList, XmlFilePath);
	}

	@Override
	public Project getProject(String projectName, String XmlFilePath){
		try{
			return getSpecificProject(projectName, XmlFilePath);
		}catch (JAXBException jaxbe) {
			LOGGER.debug("Project {} not found : {}", projectName, jaxbe);
			return null;
		}
	}

	private ProjectList getWholeFile(String XmlFilePath) throws JAXBException{
		ProjectList appConfList = new ProjectList();
		return jaxbUtils.convertXMLFileToObject(XmlFilePath, appConfList);
	}

	private Project getSpecificProject(String projectName, String XmlFilePath) throws JAXBException{
		ProjectList appConfList = getWholeFile(XmlFilePath);
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
	public void updateProject(Project oldAppConf, Project newAppConf, String XmlFilePath)
			throws JAXBException, IOException {

		ProjectList appConfList = getWholeFile(XmlFilePath);

		appConfList.getProjectList().remove(oldAppConf);
		appConfList.getProjectList().add(newAppConf);

		createAllProject(appConfList, XmlFilePath);
	}

}
