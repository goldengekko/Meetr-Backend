package com.goldengekko.meetr.service.sugarcrm;

/**
 * A list of entries returned from SugarCRM.
 * @author mattiaslevin
 */
public class SugarCRMEntryListResponse {

    private String id;

    private SugarCRMNameValueListResponse name_value_list;


    // Setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public SugarCRMNameValueListResponse getName_value_list() {
        return name_value_list;
    }

    public void setName_value_list(SugarCRMNameValueListResponse name_value_list) {
        this.name_value_list = name_value_list;
    }
}
