
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Address;
import com.google.code.linkedinapi.schema.ContactInfo;
import com.google.code.linkedinapi.schema.Country;
import com.google.code.linkedinapi.schema.Location;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "isHeadquarters",
    "isActive",
    "address",
    "contactInfo",
    "name",
    "postalCode",
    "country"
})
@XmlRootElement(name = "location")
public class LocationImpl
    implements Serializable, Location
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "is-headquarters")
    protected boolean isHeadquarters;
    @XmlElement(name = "is-active")
    protected boolean isActive;
    @XmlElement(required = true, type = AddressImpl.class)
    protected AddressImpl address;
    @XmlElement(name = "contact-info", required = true, type = ContactInfoImpl.class)
    protected ContactInfoImpl contactInfo;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "postal-code", required = true)
    protected String postalCode;
    @XmlElement(required = true, type = CountryImpl.class)
    protected CountryImpl country;

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isIsHeadquarters() {
        return isHeadquarters;
    }

    public void setIsHeadquarters(boolean value) {
        this.isHeadquarters = value;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address value) {
        this.address = ((AddressImpl) value);
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo value) {
        this.contactInfo = ((ContactInfoImpl) value);
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country value) {
        this.country = ((CountryImpl) value);
    }

}
