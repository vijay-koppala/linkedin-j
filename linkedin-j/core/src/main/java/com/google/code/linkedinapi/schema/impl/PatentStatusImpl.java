
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.PatentStatus;
import com.google.code.linkedinapi.schema.PatentStatusId;
import com.google.code.linkedinapi.schema.PatentStatusName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patent-status", propOrder = {
    "name",
    "id"
})
public class PatentStatusImpl
    implements Serializable, PatentStatus
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected PatentStatusName name;
    @XmlElement(required = true)
    protected PatentStatusId id;

    public PatentStatusName getName() {
        return name;
    }

    public void setName(PatentStatusName value) {
        this.name = value;
    }

    public PatentStatusId getId() {
        return id;
    }

    public void setId(PatentStatusId value) {
        this.id = value;
    }

}
