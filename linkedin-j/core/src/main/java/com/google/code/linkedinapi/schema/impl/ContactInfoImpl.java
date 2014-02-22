
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ContactInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phone1",
    "phone2",
    "fax"
})
@XmlRootElement(name = "contact-info")
public class ContactInfoImpl
    implements Serializable, ContactInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String phone1;
    protected String phone2;
    protected String fax;

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String value) {
        this.phone1 = value;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String value) {
        this.phone2 = value;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String value) {
        this.fax = value;
    }

}
