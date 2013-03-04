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
