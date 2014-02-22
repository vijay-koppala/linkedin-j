
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ShareTargetReach;
import com.google.code.linkedinapi.schema.ShareTargets;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shareTargets"
})
@XmlRootElement(name = "share-target-reach")
public class ShareTargetReachImpl
    implements Serializable, ShareTargetReach
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "share-targets", required = true, type = ShareTargetsImpl.class)
    protected ShareTargetsImpl shareTargets;

    public ShareTargets getShareTargets() {
        return shareTargets;
    }

    public void setShareTargets(ShareTargets value) {
        this.shareTargets = ((ShareTargetsImpl) value);
    }

}
