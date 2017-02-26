/**
 * 
 */
package com.crminterface.polaris.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author hkaramok
 *
 */
@Path("/authenticationService")
@Produces("application/json")
public class AuthenticationService {

	@GET
	@Path("/login")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response login(){
		
		System.out.println("****************************** Login attempt **********************************");
		System.out.println("*******************************************************************************");
		return Response.status(Status.OK).entity(null).build();
	}
	
	@GET
	@Path("/logout")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response logout(){
		
		System.out.println("***************************** Logout attempt **********************************");
		System.out.println("*******************************************************************************");
		return Response.status(Status.OK).entity(null).build();
	}
}
