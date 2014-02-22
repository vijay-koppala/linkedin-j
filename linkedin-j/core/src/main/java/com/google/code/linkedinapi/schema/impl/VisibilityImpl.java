
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Visibility;
import com.google.code.linkedinapi.schema.VisibilityType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "visibility")
public class VisibilityImpl
    implements Serializable, Visibility
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected VisibilityType code;

    public VisibilityType getCode() {
        return code;
    }

    public void setCode(VisibilityType value) {
        this.code = value;
    }

}
