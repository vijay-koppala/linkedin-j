
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.CompanyStatusUpdate;
import com.google.code.linkedinapi.schema.Share;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "share"
})
@XmlRootElement(name = "company-status-update")
public class CompanyStatusUpdateImpl
    implements Serializable, CompanyStatusUpdate
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = ShareImpl.class)
    protected ShareImpl share;

    public Share getShare() {
        return share;
    }

    public void setShare(Share value) {
        this.share = ((ShareImpl) value);
    }

}
