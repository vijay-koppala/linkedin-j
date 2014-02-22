
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.PostType;
import com.google.code.linkedinapi.schema.PostTypeCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "post-type", propOrder = {
    "code"
})
public class PostTypeImpl
    implements Serializable, PostType
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected PostTypeCode code;

    public PostTypeCode getCode() {
        return code;
    }

    public void setCode(PostTypeCode value) {
        this.code = value;
    }

}
