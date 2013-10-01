/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can use it, modify it and / or
 *     redistribute it as is or with your changes under the terms of the
 *     GNU General Public License as published by the Free Software
 *     Foundation, either version 3 of the License, or (at your option)
 *     any later version.
 *
 *     Meetr is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Meetr.  If not, see <http://www.gnu.org/licenses />.
 */
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