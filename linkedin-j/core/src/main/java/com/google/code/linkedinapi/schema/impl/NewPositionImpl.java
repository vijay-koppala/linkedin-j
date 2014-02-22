
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Company;
import com.google.code.linkedinapi.schema.NewPosition;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "company"
})
@XmlRootElement(name = "new-position")
public class NewPositionImpl
    implements Serializable, NewPosition
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true, type = CompanyImpl.class)
    protected CompanyImpl company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company value) {
        this.company = ((CompanyImpl) value);
    }

}
