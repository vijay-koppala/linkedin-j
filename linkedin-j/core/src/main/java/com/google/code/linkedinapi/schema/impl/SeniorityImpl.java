
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
import com.google.code.linkedinapi.schema.Seniority;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entryKey",
    "entryValue"
})
@XmlRootElement(name = "seniority")
public class SeniorityImpl
    implements Serializable, Seniority
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "entry-key", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long entryKey;
    @XmlElement(name = "entry-value", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long entryValue;

    public Long getEntryKey() {
        return entryKey;
    }

    public void setEntryKey(Long value) {
        this.entryKey = value;
    }

    public Long getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Long value) {
        this.entryValue = value;
    }

}
