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
package com.goldengekko.meetr.service.salesforce;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

/**
 * Base class for Salesforce integration services.
 * @author sosandstrom
 */
public class SalesforceService {

    static final Logger                      LOG          = LoggerFactory.getLogger(SalesforceService.class);

    protected static final ThreadLocal<String> TOKEN        = new ThreadLocal<String>();
    protected static final ThreadLocal<String> INSTANCE_URL = new ThreadLocal<String>();

    protected static HttpEntity getRequestEntity(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        final String auth = String.format("OAuth %s", accessToken);
        headers.add("Authorization", auth);
        LOG.info("Salesforce Authorization: {}", auth);
        final HttpEntity requestEntity = new HttpEntity(headers);
        return requestEntity;
    }

    public final void setToken(String token) {
        TOKEN.set(token);
    }

    public final void setAppArg0(String instanceUrl) {
        INSTANCE_URL.set(instanceUrl);
    }

}
