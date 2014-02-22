
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Action;
import com.google.code.linkedinapi.schema.CompanyJobUpdate;
import com.google.code.linkedinapi.schema.Job;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "job",
    "action"
})
@XmlRootElement(name = "company-job-update")
public class CompanyJobUpdateImpl
    implements Serializable, CompanyJobUpdate
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = JobImpl.class)
    protected JobImpl job;
    @XmlElement(required = true, type = ActionImpl.class)
    protected ActionImpl action;

    public Job getJob() {
        return job;
    }

    public void setJob(Job value) {
        this.job = ((JobImpl) value);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action value) {
        this.action = ((ActionImpl) value);
    }

}
