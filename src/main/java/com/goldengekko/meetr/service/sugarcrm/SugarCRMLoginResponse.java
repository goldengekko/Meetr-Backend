package com.goldengekko.meetr.service.sugarcrm;

/**
 * The login response from SugarCRM
 */
public class SugarCRMLoginResponse {

    /** The user login token */
    private String id;

    /** In case of failed log in, name will be set to "Invalid login" */
    private String name;


    // Get error message
    public boolean hasError() {
        return null == this.id;
    }

    public boolean isInvalidCredentials() {
        return name.equalsIgnoreCase("Invalid Login");
    }


    @Override
    public String toString() {
        return String.format("Token:%s", this.getId());
    }

    // Setters and Getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
