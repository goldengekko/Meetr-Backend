package com.goldengekko.meetr.service.sugarcrm;

/**
 * Contains a name value pair returned from SugarCRM.
 * @author mattiaslevin
 */
public class SugarCRMNameValueResponse {

    private String name;

    private String value;

    @Override
    public String toString() {
        return String.format("%s:%s", this.name, this.value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
