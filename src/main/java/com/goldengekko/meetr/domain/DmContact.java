package com.goldengekko.meetr.domain;

import net.sf.mardao.core.domain.AbstractCreatedUpdatedEntity;

/**
 * Domain object for contacts
 * @author mlv
 */
public class DmContact extends AbstractCreatedUpdatedEntity {

    /** Unique contact id */
    private String id;

    /** The contacts name */
    private String firstName;

    /** The contacts last name */
    private String lastName;

    /** The contacts name */
    private String name;

    /** The name of the company */
    private String companyName;

    /** The contacts email */
    private String email;

    /** The contacts phone number */
    private String phoneNumber;

    // Address information

    /** Street address */
    private String street;

    /** The city area or or district */
    private String cityArea;

    /** City, town, village */
    private String city;

    /** County */
    private String county;

    /** Country */
    private String country;

    /** Postal code */
    private String postalCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}