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

import com.goldengekko.meetr.json.JEndpoints;
import com.wadpam.docrest.domain.RestCode;
import com.wadpam.docrest.domain.RestReturn;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * For the clients to discover additional Endpoint URLs
 * @author os
 */
@Controller
@RequestMapping(value={"{domain}/endpoints"})
public class EndpointsController {
    
    static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyyMMdd HHmmss");
    
    private String apiUrl;
    private String signinUrl;
    private String oauthUrl;
    private String updatedYYYYMMddHHmmss;
    
    @RestReturn(value=JEndpoints.class, code={
        @RestCode(code=200, description="OK", message="OK")
    })
    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public JEndpoints getEndpoints(WebRequest webRequest) throws ParseException {
        Date updatedDate = FORMATTER.parse(updatedYYYYMMddHHmmss);
        final JEndpoints body = new JEndpoints(apiUrl, signinUrl, oauthUrl, updatedDate.getTime());
        
        final long lastModified = body.getUpdatedDate();
        if (webRequest.checkNotModified(lastModified)) {
            // shortcut exit - no further processing necessary
            return null;
        }
        
        return body;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void setSigninUrl(String signinUrl) {
        this.signinUrl = signinUrl;
    }

    public void setOauthUrl(String oauthUrl) {
        this.oauthUrl = oauthUrl;
    }

    public void setUpdatedYYYYMMddHHmmss(String updatedYYYYMMddHHmmss) {
        this.updatedYYYYMMddHHmmss = updatedYYYYMMddHHmmss;
    }

}
