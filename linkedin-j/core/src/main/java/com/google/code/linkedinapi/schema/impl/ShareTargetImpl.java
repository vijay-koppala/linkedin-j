
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ShareTarget;
import com.google.code.linkedinapi.schema.Tvalues;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "tvalues"
})
@XmlRootElement(name = "share-target")
public class ShareTargetImpl
    implements Serializable, ShareTarget
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true, type = TvaluesImpl.class)
    protected TvaluesImpl tvalues;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public Tvalues getTvalues() {
        return tvalues;
    }

    public void setTvalues(Tvalues value) {
        this.tvalues = ((TvaluesImpl) value);
    }

}
