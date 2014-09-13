
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.ViewByMonth;
import com.google.code.linkedinapi.schema.ViewsByMonth;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "viewByMonth"
})
@XmlRootElement(name = "views-by-month")
public class ViewsByMonthImpl
    implements Serializable, ViewsByMonth
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "view-by-month", required = true, type = ViewByMonthImpl.class)
    protected List<ViewByMonth> viewByMonth;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long total;

    public List<ViewByMonth> getViewByMonth() {
        if (viewByMonth == null) {
            viewByMonth = new ArrayList<ViewByMonth>();
        }
        return this.viewByMonth;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

}