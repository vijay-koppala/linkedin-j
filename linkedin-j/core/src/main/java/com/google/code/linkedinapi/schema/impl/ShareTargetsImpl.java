
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ShareTarget;
import com.google.code.linkedinapi.schema.ShareTargets;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shareTarget"
})
@XmlRootElement(name = "share-targets")
public class ShareTargetsImpl
    implements Serializable, ShareTargets
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "share-target", required = true, type = ShareTargetImpl.class)
    protected List<ShareTarget> shareTarget;

    public List<ShareTarget> getShareTarget() {
        if (shareTarget == null) {
            shareTarget = new ArrayList<ShareTarget>();
        }
        return this.shareTarget;
    }

}
