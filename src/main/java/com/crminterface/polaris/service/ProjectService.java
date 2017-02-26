/**
 * 
 */
package com.crminterface.polaris.service;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.Consumes;
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

import com.crminterface.polaris.dao.ProjectDAO;
import com.crminterface.polaris.dao.ProjectJAXBDAOImpl;
import com.crminterface.polaris.model.CustomException;
import com.crminterface.polaris.model.DefaultParameters;
import com.crminterface.polaris.model.Project;

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
@Path("/ProjectService")
@Api(value="ProjectService")
public class ProjectService {

	@Autowired
	private ProjectDAO projectDAO;

	@Autowired
	private DozerBeanMapper mapper;

	@Autowired
	private ProjectJAXBDAOImpl projectjaxBDAO;

	private static Logger LOGGER = LoggerFactory.getLogger(ProjectService.class);

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/getAll", notes="Get all the project configurations", response = Project.class)
	public Response getAll() throws JAXBException{

		Set<Project> projectList;
		// Using Hibernate
		// projectList = projectDAO.getAllProject();

		// Using Jaxb
		projectList = projectjaxBDAO.getAllProject(DefaultParameters.parameters.getProjectConfigurationPath());

		LOGGER.debug("List of projects : {}", projectList);

		return Response.status(Status.OK).entity(projectList).build();
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/get", notes="Get project configuration by projectName", response = Project.class)
	public Response get(@ApiParam(name = "projectName")
	@QueryParam("projectName") String projectName) throws JAXBException{

		Project project;
		// Using Hibernate
		// project = projectDAO.findByProjectName(projectName);

		// Using Jaxb
		project = projectjaxBDAO.getProject(projectName, DefaultParameters.parameters.getProjectConfigurationPath());

		LOGGER.debug("Project configuration : {}", project);
		if(project != null){
			return Response.status(Status.OK).entity(project).build();
		}
		return Response.status(Status.NOT_FOUND).entity(new CustomException("Project not found.")).build();
		
	}

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/create", notes="Create a project configuration")
	public Response create(@ApiParam(name = "project") Project project) throws JAXBException, IOException{

		// Using Hibernate
		// projectDAO.createApplicationConfiguration(applicationConfiguration);

		// Using Jaxb
		projectjaxBDAO.createProject(project, DefaultParameters.parameters.getProjectConfigurationPath());

		return Response.status(Status.OK).build();
	}

	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/update", notes="Update a project configuration")
	public Response update(@ApiParam(name = "projectName")
	@QueryParam("projectName") String projectName, @ApiParam(name = "project") Project newProject) throws JAXBException, IOException{

		Project projectToUpdate;
		
		// Using Hibernate
		// projectToUpdate = projectConfDAO.findByProjectName(projectName);
		
		// Using Jaxb
		projectToUpdate = projectjaxBDAO.getProject(projectName, DefaultParameters.parameters.getProjectConfigurationPath());

		if(projectToUpdate != null){
			// Using Hibernate
			// projectToUpdate = mapper.map(newProject, Project.class);
			
			// Using Jaxb
			projectjaxBDAO.updateProject(projectToUpdate, newProject, DefaultParameters.parameters.getProjectConfigurationPath());
			
			return Response.status(Status.OK).build();
		} else{
			return Response.status(Status.NOT_FOUND).build();
		}
	}
}
