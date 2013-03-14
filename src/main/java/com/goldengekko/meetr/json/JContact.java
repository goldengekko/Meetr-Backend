package com.goldengekko.meetr.json;

import com.wadpam.open.json.JBaseObject;

/**
 * Json representation of contacts.
 * 
 * @author mlv
 */
public class JContact extends JBaseObject {

    /** The contacts first name */
    private String firstName;

    /** The contacts last name */
    private String lastName;

    /** The contacts email */
    private String email;

    /** The contacts phone number */
    private String phone;

    /** The contacts mobile phone number */
    private String mobilePhone;

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

    public String toString() {
        return String.format("{id:%s, first:%s, last: %s}", getId(), firstName, lastName);
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneNumber) {
        this.phone = phoneNumber;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

}
