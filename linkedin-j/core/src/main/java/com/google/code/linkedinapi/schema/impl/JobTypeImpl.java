
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.JobType;
import com.google.code.linkedinapi.schema.JobTypeCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name"
})
@XmlRootElement(name = "job-type")
public class JobTypeImpl
    implements Serializable, JobType
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected JobTypeCode code;
    @XmlElement(required = true)
    protected String name;

    public JobTypeCode getCode() {
        return code;
    }

    public void setCode(JobTypeCode value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
