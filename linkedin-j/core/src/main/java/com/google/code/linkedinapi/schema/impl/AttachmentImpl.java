
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
import com.google.code.linkedinapi.schema.Attachment;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "summary",
    "title",
    "contentDomain",
    "contentUrl",
    "imageUrl"
})
@XmlRootElement(name = "attachment")
public class AttachmentImpl
    implements Serializable, Attachment
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String summary;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "content-domain", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String contentDomain;
    @XmlElement(name = "content-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String contentUrl;
    @XmlElement(name = "image-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imageUrl;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String value) {
        this.summary = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getContentDomain() {
        return contentDomain;
    }

    public void setContentDomain(String value) {
        this.contentDomain = value;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String value) {
        this.contentUrl = value;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

}
