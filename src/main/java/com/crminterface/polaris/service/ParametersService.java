/**
 * 
 */
package com.crminterface.polaris.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crminterface.polaris.model.DefaultParameters;
import com.crminterface.polaris.model.Parameters;
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
@Path("/parametersService")
@Api(value="parametersService")
@Component
public class ParametersService {

	private static Logger LOGGER = LoggerFactory.getLogger(ParametersService.class);
	
	private static Parameters parameters = new Parameters("1", "D:\\packagingTest\\projectConfiguration.xml", "D:\\packagingTest\\", true, true);
	

	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(value="/get", notes="Getting parameters")
	public Response get(){

		LOGGER.debug("Parameters : {}", parameters);
		return Response.status(Status.OK).entity(DefaultParameters.parameters).build();
	}
	
	@PUT
	@Path("/put")
	@Consumes({ MediaType.APPLICATION_JSON })
	@ApiOperation(value="/put", notes="Updating parameters")
	public Response put(@ApiParam(name = "parameters")Parameters p){
		
		LOGGER.debug("New parameters : {}", p);
		LOGGER.debug("Old parameters : {}", DefaultParameters.parameters);
		DefaultParameters.parameters = p;
		return Response.status(Status.OK).build();
	}
}
