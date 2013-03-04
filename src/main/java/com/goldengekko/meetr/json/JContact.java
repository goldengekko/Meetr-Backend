package com.goldengekko.meetr.json;

import com.wadpam.open.json.JBaseObject;

/**
 * Json representation of contacts.
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
    private String phoneNumber;


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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
