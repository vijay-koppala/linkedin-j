
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.RecommendationCode;
import com.google.code.linkedinapi.schema.RecommendationType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "recommendation-type")
public class RecommendationTypeImpl
    implements Serializable, RecommendationType
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected RecommendationCode code;

    public RecommendationCode getCode() {
        return code;
    }

    public void setCode(RecommendationCode value) {
        this.code = value;
    }

}
