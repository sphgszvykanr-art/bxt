package com.training;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/rest/*")
public class Application extends ResourceConfig {

	public Application() {

	packages("com.training.resources");
	
	}

	
	
}
