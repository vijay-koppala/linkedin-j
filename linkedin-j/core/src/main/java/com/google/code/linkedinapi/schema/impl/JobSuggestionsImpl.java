
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.JobSuggestions;
import com.google.code.linkedinapi.schema.Jobs;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobs"
})
@XmlRootElement(name = "job-suggestions")
public class JobSuggestionsImpl
    implements Serializable, JobSuggestions
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = JobsImpl.class)
    protected JobsImpl jobs;

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs value) {
        this.jobs = ((JobsImpl) value);
    }

}
