
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Address;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "street1",
    "street2",
    "city",
    "state",
    "postalCode",
    "countryCode",
    "regionCode"
})
@XmlRootElement(name = "address")
public class AddressImpl
    implements Serializable, Address
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String street1;
    protected String street2;
    @XmlElement(required = true)
    protected String city;
    protected String state;
    @XmlElement(name = "postal-code", required = true)
    protected String postalCode;
    @XmlElement(name = "country-code")
    protected String countryCode;
    @XmlElement(name = "region-code")
    protected String regionCode;

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String value) {
        this.street1 = value;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String value) {
        this.street2 = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String value) {
        this.regionCode = value;
    }

}
