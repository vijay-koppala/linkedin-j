
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Industries;
import com.google.code.linkedinapi.schema.Industry;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "industryList"
})
@XmlRootElement(name = "industries")
public class IndustriesImpl
    implements Serializable, Industries
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "industry", required = true, type = IndustryImpl.class)
    protected List<Industry> industryList;

    public List<Industry> getIndustryList() {
        if (industryList == null) {
            industryList = new ArrayList<Industry>();
        }
        return this.industryList;
    }

}
