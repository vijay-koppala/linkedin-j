
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Facets;
import com.google.code.linkedinapi.schema.JobSearch;
import com.google.code.linkedinapi.schema.Jobs;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobs",
    "facets"
})
@XmlRootElement(name = "job-search")
public class JobSearchImpl
    implements Serializable, JobSearch
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = JobsImpl.class)
    protected JobsImpl jobs;
    @XmlElement(required = true, type = FacetsImpl.class)
    protected FacetsImpl facets;

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs value) {
        this.jobs = ((JobsImpl) value);
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets value) {
        this.facets = ((FacetsImpl) value);
    }

}
