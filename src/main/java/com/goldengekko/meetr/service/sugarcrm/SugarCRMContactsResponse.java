package com.goldengekko.meetr.service.sugarcrm;

import java.util.Collection;

/**
 * A list of contacts returned from SugareCRM.
 * @author mattiaslevin
 */
public class SugarCRMContactsResponse {

    private int result_count;

    private int total_count;

    private int next_offset;

    private Collection<SugarCRMEntryListResponse> entry_list;

    /** In case of failed log in, name will be set to "Invalid login" */
    private String name;

    // Check if the parsed response have error
    public boolean hasError() {
        return false;
    }

    public boolean isTokenInvalid() {
        return name.equalsIgnoreCase("Invalid Session ID");
    }

    // Setters and getters
    public int getResult_count() {
        return result_count;
    }

    public void setResult_count(int result_count) {
        this.result_count = result_count;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getNext_offset() {
        return next_offset;
    }

    public void setNext_offset(int next_offset) {
        this.next_offset = next_offset;
    }

    public Collection<SugarCRMEntryListResponse> getEntry_list() {
        return entry_list;
    }

    public void setEntry_list(Collection<SugarCRMEntryListResponse> entry_list) {
        this.entry_list = entry_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
