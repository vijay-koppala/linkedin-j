
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Category;
import com.google.code.linkedinapi.schema.PostCategoryCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "category")
public class CategoryImpl
    implements Serializable, Category
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected PostCategoryCode code;

    public PostCategoryCode getCode() {
        return code;
    }

    public void setCode(PostCategoryCode value) {
        this.code = value;
    }

}
