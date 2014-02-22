
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.GroupCategory;
import com.google.code.linkedinapi.schema.GroupCategoryCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group-category", propOrder = {
    "code"
})
public class GroupCategoryImpl
    implements Serializable, GroupCategory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected GroupCategoryCode code;

    public GroupCategoryCode getCode() {
        return code;
    }

    public void setCode(GroupCategoryCode value) {
        this.code = value;
    }

}
