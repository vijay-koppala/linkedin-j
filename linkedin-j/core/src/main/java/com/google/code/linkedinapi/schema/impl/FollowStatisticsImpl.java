
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.FollowStatistics;
import com.google.code.linkedinapi.schema.Seniorities;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "count",
    "employeeCount",
    "nonEmployeeCount",
    "seniorities"
})
@XmlRootElement(name = "follow-statistics")
public class FollowStatisticsImpl
    implements Serializable, FollowStatistics
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long count;
    @XmlElement(name = "employee-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long employeeCount;
    @XmlElement(name = "non-employee-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long nonEmployeeCount;
    @XmlElement(required = true, type = SenioritiesImpl.class)
    protected SenioritiesImpl seniorities;

    public Long getCount() {
        return count;
    }

    public void setCount(Long value) {
        this.count = value;
    }

    public Long getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Long value) {
        this.employeeCount = value;
    }

    public Long getNonEmployeeCount() {
        return nonEmployeeCount;
    }

    public void setNonEmployeeCount(Long value) {
        this.nonEmployeeCount = value;
    }

    public Seniorities getSeniorities() {
        return seniorities;
    }

    public void setSeniorities(Seniorities value) {
        this.seniorities = ((SenioritiesImpl) value);
    }

}
