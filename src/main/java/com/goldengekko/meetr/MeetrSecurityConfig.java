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

import com.wadpam.open.security.RolesInterceptor;
import com.wadpam.open.security.SecurityConfig;
import com.wadpam.open.security.SecurityInterceptor;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author sosandstrom
 */
public class MeetrSecurityConfig implements SecurityConfig {

    private SecurityInterceptor basicInterceptor;
    private SecurityInterceptor oauth2Interceptor;
    private RolesInterceptor rolesInterceptor;
    
    public static final String ROLE_ITEST = "ROLE_ITEST";
    
    public void init() {
        Collection<Map.Entry<String, Collection<String>>> oauthWhitelist = WHITELIST_BUILDER
                .with("\\A/api/[^/]+/federated/v", GET, POST)
                .add("\\A/api/dev/meeting", GET, POST, DELETE)
                .add("\\A/api/dev/agenda", GET, POST, DELETE)
                .add("\\A/api/dev/file", GET, POST, DELETE)
                .add("\\A/api/dev/task", GET, POST, DELETE)
            .build();

        oauth2Interceptor.setWhitelistedMethods(oauthWhitelist);
    }

    public void setBasicInterceptor(SecurityInterceptor basicInterceptor) {
        this.basicInterceptor = basicInterceptor;
    }

    public void setOauth2Interceptor(SecurityInterceptor oauth2Interceptor) {
        this.oauth2Interceptor = oauth2Interceptor;
    }

    public void setRolesInterceptor(RolesInterceptor rolesInterceptor) {
        this.rolesInterceptor = rolesInterceptor;
    }

    
}
