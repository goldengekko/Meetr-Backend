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
