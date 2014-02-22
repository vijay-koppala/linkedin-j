
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Proficiency;
import com.google.code.linkedinapi.schema.ProficiencyLevelType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "level",
    "name"
})
@XmlRootElement(name = "proficiency")
public class ProficiencyImpl
    implements Serializable, Proficiency
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected ProficiencyLevelType level;
    @XmlElement(required = true)
    protected String name;

    public ProficiencyLevelType getLevel() {
        return level;
    }

    public void setLevel(ProficiencyLevelType value) {
        this.level = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
