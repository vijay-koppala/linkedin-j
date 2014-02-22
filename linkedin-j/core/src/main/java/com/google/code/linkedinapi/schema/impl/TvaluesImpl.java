
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Tvalues;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tvalue"
})
@XmlRootElement(name = "tvalues")
public class TvaluesImpl
    implements Serializable, Tvalues
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String tvalue;

    public String getTvalue() {
        return tvalue;
    }

    public void setTvalue(String value) {
        this.tvalue = value;
    }

}
