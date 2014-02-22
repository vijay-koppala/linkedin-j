
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Date;
import com.google.code.linkedinapi.schema.Inventors;
import com.google.code.linkedinapi.schema.Office;
import com.google.code.linkedinapi.schema.Patent;
import com.google.code.linkedinapi.schema.PatentStatus;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "title",
    "date",
    "url",
    "summary",
    "number",
    "status",
    "office",
    "inventors"
})
@XmlRootElement(name = "patent")
public class PatentImpl
    implements Serializable, Patent
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true, type = DateImpl.class)
    protected DateImpl date;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected String summary;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true, type = PatentStatusImpl.class)
    protected PatentStatusImpl status;
    @XmlElement(required = true, type = OfficeImpl.class)
    protected OfficeImpl office;
    @XmlElement(required = true, type = InventorsImpl.class)
    protected InventorsImpl inventors;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = ((DateImpl) value);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String value) {
        this.summary = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public PatentStatus getStatus() {
        return status;
    }

    public void setStatus(PatentStatus value) {
        this.status = ((PatentStatusImpl) value);
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office value) {
        this.office = ((OfficeImpl) value);
    }

    public Inventors getInventors() {
        return inventors;
    }

    public void setInventors(Inventors value) {
        this.inventors = ((InventorsImpl) value);
    }

}
