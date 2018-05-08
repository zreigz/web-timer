package com.zreigz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

import  java.lang.StringBuilder;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WebResource {


	// SLF4J is provided with dropwizard. Logback is also provided
	Logger log = LoggerFactory.getLogger(WebResource.class);

	public WebResource() {
	}

	@GET
	public String getData() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  Date date = new Date();
		return new StringBuilder().append("{\"time\" : \"").append(dateFormat.format(date)).append("\"}").toString();
	}

}
