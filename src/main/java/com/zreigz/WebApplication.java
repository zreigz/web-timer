package com.zreigz;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class WebApplication extends Application<Configuration> {
	public static void main(String[] args) throws Exception {
		new WebApplication().run(args);
	}

	@Override
	public String getName() {
		return "web-service";
	}

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap) {
		// nothing to do yet
	}

	@Override
	public void run(Configuration configuration, Environment environment) {
		// register resource now
		final WebResource resource = new WebResource();
		environment.jersey().register(resource);
	}

}
