
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.CompanyStatistics;
import com.google.code.linkedinapi.schema.FollowStatistics;
import com.google.code.linkedinapi.schema.StatusUpdateStatistics;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusUpdateStatistics",
    "followStatistics"
})
@XmlRootElement(name = "company-statistics")
public class CompanyStatisticsImpl
    implements Serializable, CompanyStatistics
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "status-update-statistics", required = true, type = StatusUpdateStatisticsImpl.class)
    protected StatusUpdateStatisticsImpl statusUpdateStatistics;
    @XmlElement(name = "follow-statistics", required = true, type = FollowStatisticsImpl.class)
    protected FollowStatisticsImpl followStatistics;

    public StatusUpdateStatistics getStatusUpdateStatistics() {
        return statusUpdateStatistics;
    }

    public void setStatusUpdateStatistics(StatusUpdateStatistics value) {
        this.statusUpdateStatistics = ((StatusUpdateStatisticsImpl) value);
    }

    public FollowStatistics getFollowStatistics() {
        return followStatistics;
    }

    public void setFollowStatistics(FollowStatistics value) {
        this.followStatistics = ((FollowStatisticsImpl) value);
    }

}
