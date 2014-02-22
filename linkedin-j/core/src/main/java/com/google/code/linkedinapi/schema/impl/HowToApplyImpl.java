
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.HowToApply;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationUrl"
})
@XmlRootElement(name = "how-to-apply")
public class HowToApplyImpl
    implements Serializable, HowToApply
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "application-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String applicationUrl;

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String value) {
        this.applicationUrl = value;
    }

}
