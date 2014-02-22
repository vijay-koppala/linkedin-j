
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.NameType;
import com.google.code.linkedinapi.schema.Proficiency;
import com.google.code.linkedinapi.schema.Skill;
import com.google.code.linkedinapi.schema.Years;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "proficiency",
    "years",
    "id",
    "skill"
})
@XmlRootElement(name = "skill")
public class SkillImpl
    implements Serializable, Skill
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = ProficiencyImpl.class)
    protected ProficiencyImpl proficiency;
    @XmlElement(required = true, type = YearsImpl.class)
    protected YearsImpl years;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true, type = NameTypeImpl.class)
    protected NameTypeImpl skill;

    public Proficiency getProficiency() {
        return proficiency;
    }

    public void setProficiency(Proficiency value) {
        this.proficiency = ((ProficiencyImpl) value);
    }

    public Years getYears() {
        return years;
    }

    public void setYears(Years value) {
        this.years = ((YearsImpl) value);
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public NameType getSkill() {
        return skill;
    }

    public void setSkill(NameType value) {
        this.skill = ((NameTypeImpl) value);
    }

}
