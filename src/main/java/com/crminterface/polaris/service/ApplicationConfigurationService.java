/**
 * 
 */
package com.crminterface.polaris.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.crminterface.polaris.dao.ApplicationConfigurationDAO;
import com.crminterface.polaris.model.ApplicationConfiguration;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author hkaramok
 *
 */
@Transactional
@Path("/ApplicationConfigurationService")
@Api(value="ApplicationConfigurationService")
public class ApplicationConfigurationService {

	@Autowired
	private ApplicationConfigurationDAO applicationConfDAO;

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/get", notes="Get all the application configuration")
	public Response get(){
		List<ApplicationConfiguration> appConfList = applicationConfDAO.getAllApplicationConfiguration();

		return Response.status(Status.OK).entity(appConfList).build();
	}

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="/create", notes="Create an application configuration")
	public Response create(@ApiParam(name = "applicationConfiguration")
						@QueryParam("applicationConfiguration") ApplicationConfiguration applicationConfiguration){
		
		applicationConfDAO.createApplicationConfiguration(applicationConfiguration);

		return Response.status(Status.OK).build();
	}
}
