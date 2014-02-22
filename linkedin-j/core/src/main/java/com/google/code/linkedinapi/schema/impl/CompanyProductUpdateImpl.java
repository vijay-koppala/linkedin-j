
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Action;
import com.google.code.linkedinapi.schema.CompanyProductUpdate;
import com.google.code.linkedinapi.schema.EventType;
import com.google.code.linkedinapi.schema.Product;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "action",
    "eventType",
    "product"
})
@XmlRootElement(name = "company-product-update")
public class CompanyProductUpdateImpl
    implements Serializable, CompanyProductUpdate
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = ActionImpl.class)
    protected ActionImpl action;
    @XmlElement(name = "event-type", required = true, type = EventTypeImpl.class)
    protected EventTypeImpl eventType;
    @XmlElement(required = true, type = ProductImpl.class)
    protected ProductImpl product;

    public Action getAction() {
        return action;
    }

    public void setAction(Action value) {
        this.action = ((ActionImpl) value);
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType value) {
        this.eventType = ((EventTypeImpl) value);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product value) {
        this.product = ((ProductImpl) value);
    }

}
