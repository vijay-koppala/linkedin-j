
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.CompanyStatus;
import com.google.code.linkedinapi.schema.CompanyStatusCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "company-status", propOrder = {
    "code",
    "name"
})
public class CompanyStatusImpl
    implements Serializable, CompanyStatus
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected CompanyStatusCode code;
    @XmlElement(required = true)
    protected String name;

    public CompanyStatusCode getCode() {
        return code;
    }

    public void setCode(CompanyStatusCode value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
