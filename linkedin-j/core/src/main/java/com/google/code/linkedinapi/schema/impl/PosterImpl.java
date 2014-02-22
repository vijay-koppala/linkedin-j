
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Poster;
import com.google.code.linkedinapi.schema.Role;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "display",
    "role",
    "emailAddress"
})
@XmlRootElement(name = "poster")
public class PosterImpl
    implements Serializable, Poster
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected boolean display;
    @XmlElement(required = true, type = RoleImpl.class)
    protected RoleImpl role;
    @XmlElement(name = "email-address", required = true)
    protected String emailAddress;

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean value) {
        this.display = value;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role value) {
        this.role = ((RoleImpl) value);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
