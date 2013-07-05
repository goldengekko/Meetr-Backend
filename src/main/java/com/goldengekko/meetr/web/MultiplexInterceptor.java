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
package com.goldengekko.meetr.web;

import com.goldengekko.meetr.service.MultiplexCrudService;
import com.wadpam.open.domain.DAppDomain;
import com.wadpam.open.security.SecurityInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author sosandstrom
 */
public class MultiplexInterceptor extends HandlerInterceptorAdapter {
    
    static final Logger LOG = LoggerFactory.getLogger(MultiplexInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final DAppDomain domain = (DAppDomain) request.getAttribute(SecurityInterceptor.ATTR_NAME_PRINCIPAL);
        if (null != domain) {
            final String mux = domain.getAppArg1();
            LOG.debug("Setting MUX to {}", mux);
            MultiplexCrudService.setMultiplexKey(mux);
        }
        return true;
    }

    
    
}
