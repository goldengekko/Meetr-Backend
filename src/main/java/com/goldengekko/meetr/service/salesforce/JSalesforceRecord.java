/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author sosandstrom
 */
public class JSalesforceRecord {
    private JSalesforceAttributes attributes;
    private String Id;

    public JSalesforceAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(JSalesforceAttributes attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return Id;
    }

    @JsonProperty("Id")
    public void setId(String Id) {
        this.Id = Id;
    }
    
    
}
