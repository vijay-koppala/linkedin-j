
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ProfileField;
import com.google.code.linkedinapi.schema.ProfileFieldCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "profile-field")
public class ProfileFieldImpl
    implements Serializable, ProfileField
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected ProfileFieldCode code;

    public ProfileFieldCode getCode() {
        return code;
    }

    public void setCode(ProfileFieldCode value) {
        this.code = value;
    }

}
