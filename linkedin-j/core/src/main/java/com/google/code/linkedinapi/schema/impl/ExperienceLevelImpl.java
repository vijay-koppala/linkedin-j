
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ExperienceLevel;
import com.google.code.linkedinapi.schema.ExperienceLevelCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name"
})
@XmlRootElement(name = "experience-level")
public class ExperienceLevelImpl
    implements Serializable, ExperienceLevel
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected ExperienceLevelCode code;
    @XmlElement(required = true)
    protected String name;

    public ExperienceLevelCode getCode() {
        return code;
    }

    public void setCode(ExperienceLevelCode value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
