package com.richo.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/bookstore")
public interface Api
{
	@GET
	String getString();
}
