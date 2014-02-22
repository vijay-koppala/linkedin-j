
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.MembershipState;
import com.google.code.linkedinapi.schema.MembershipStateCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "membership-state")
public class MembershipStateImpl
    implements Serializable, MembershipState
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected MembershipStateCode code;

    public MembershipStateCode getCode() {
        return code;
    }

    public void setCode(MembershipStateCode value) {
        this.code = value;
    }

}
