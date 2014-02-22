
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
import com.google.code.linkedinapi.schema.Category;
import com.google.code.linkedinapi.schema.CountForCategory;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "category",
    "count"
})
@XmlRootElement(name = "count-for-category")
public class CountForCategoryImpl
    implements Serializable, CountForCategory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = CategoryImpl.class)
    protected CategoryImpl category;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long count;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category value) {
        this.category = ((CategoryImpl) value);
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long value) {
        this.count = value;
    }

}
