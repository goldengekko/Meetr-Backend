package com.goldengekko.meetr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.ConfigurableWebApplicationContext;

/**
 *
 * @author os
 */
public class ContextProfileInitializer implements ApplicationContextInitializer<ConfigurableWebApplicationContext> {
    
    static final Logger LOG = LoggerFactory.getLogger(ContextProfileInitializer.class);
	
	public void initialize(ConfigurableWebApplicationContext ctx) {
		ConfigurableEnvironment environment = ctx.getEnvironment();
                final String activeProfiles = ctx.getServletContext().getInitParameter("contxt.profile.initializer.active");
                final String[] profiles = activeProfiles.split(",");
                LOG.info("activating profiles {} from {}", profiles, activeProfiles);
		environment.setActiveProfiles(profiles);
	}
	
}