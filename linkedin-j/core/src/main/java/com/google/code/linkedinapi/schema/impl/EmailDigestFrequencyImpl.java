
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.EmailDigestFrequency;
import com.google.code.linkedinapi.schema.EmailDigestFrequencyCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "email-digest-frequency")
public class EmailDigestFrequencyImpl
    implements Serializable, EmailDigestFrequency
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected EmailDigestFrequencyCode code;

    public EmailDigestFrequencyCode getCode() {
        return code;
    }

    public void setCode(EmailDigestFrequencyCode value) {
        this.code = value;
    }

}
