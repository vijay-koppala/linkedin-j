
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.JobFunction;
import com.google.code.linkedinapi.schema.JobFunctions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobFunctionList"
})
@XmlRootElement(name = "job-functions")
public class JobFunctionsImpl
    implements Serializable, JobFunctions
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "job-function", required = true, type = JobFunctionImpl.class)
    protected List<JobFunction> jobFunctionList;

    public List<JobFunction> getJobFunctionList() {
        if (jobFunctionList == null) {
            jobFunctionList = new ArrayList<JobFunction>();
        }
        return this.jobFunctionList;
    }

}
