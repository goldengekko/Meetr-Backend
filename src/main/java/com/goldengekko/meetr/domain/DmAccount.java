/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.domain.AbstractStringEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DmAccount extends AbstractStringEntity {
    
    @Basic
    private String name;
    
    @Basic
    private String phone;
    
    @Basic
    private String shippingCity;
    @Basic
    private String shippingCountry;
    @Basic
    private String shippingPostalCode;
    @Basic
    private String shippingState;
    @Basic
    private String shippingStreet;
    
    @Basic
    private String wwwUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWwwUrl() {
        return wwwUrl;
    }

    public void setWwwUrl(String wwwUrl) {
        this.wwwUrl = wwwUrl;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
}
