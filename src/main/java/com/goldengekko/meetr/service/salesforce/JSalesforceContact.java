/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author sosandstrom
 */
public class JSalesforceContact extends JSalesforceRecord {
    private String Name;
    private String FirstName;
    private String LastName;
    private String Email;

    public String getName() {
        return Name;
    }

    @JsonProperty("Name")
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFirstName() {
        return FirstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    
}
