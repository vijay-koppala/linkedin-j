
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Role;
import com.google.code.linkedinapi.schema.RoleCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "role")
public class RoleImpl
    implements Serializable, Role
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected RoleCode code;

    public RoleCode getCode() {
        return code;
    }

    public void setCode(RoleCode value) {
        this.code = value;
    }

}
