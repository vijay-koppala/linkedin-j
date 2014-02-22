
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.JobFunction;
import com.google.code.linkedinapi.schema.JobFunctionCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name"
})
@XmlRootElement(name = "job-function")
public class JobFunctionImpl
    implements Serializable, JobFunction
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected JobFunctionCode code;
    @XmlElement(required = true)
    protected String name;

    public JobFunctionCode getCode() {
        return code;
    }

    public void setCode(JobFunctionCode value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
