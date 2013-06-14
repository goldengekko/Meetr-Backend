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
package com.goldengekko.meetr.json;

import java.io.Serializable;

/**
 * The response body of the /api/endpoints discovery request.
 * @author os
 */
public class JEndpoints implements Serializable {

    /** The base URL to the APIs, including the domain, for example http://host.com/api/testenv/ */
    private String apiUrl;
    
    /** The base URL to the signin API, including the domain, for example https://host.com/signin/testenv/ */
    private String signinUrl;
    
    /** The URL to the OAuth Endpoint, for example https://host.com/ */
    private String oauthUrl;

    /** Milliseconds since 1970 when this Entity was last updated in the database */
    private Long   updatedDate;

    public JEndpoints() {
    }
    
    public JEndpoints(String apiUrl, String signinUrl, String oauthUrl, Long updatedDate) {
        this.apiUrl = apiUrl;
        this.signinUrl = signinUrl;
        this.oauthUrl = oauthUrl;
        this.updatedDate = updatedDate;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getSigninUrl() {
        return signinUrl;
    }

    public void setSigninUrl(String signinUrl) {
        this.signinUrl = signinUrl;
    }

    public String getOauthUrl() {
        return oauthUrl;
    }

    public void setOauthUrl(String oauthUrl) {
        this.oauthUrl = oauthUrl;
    }

    public Long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Long updatedDate) {
        this.updatedDate = updatedDate;
    }

}
