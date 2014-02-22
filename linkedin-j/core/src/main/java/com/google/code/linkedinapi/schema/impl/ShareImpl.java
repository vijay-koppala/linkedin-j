
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
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.Attribution;
import com.google.code.linkedinapi.schema.Author;
import com.google.code.linkedinapi.schema.Content;
import com.google.code.linkedinapi.schema.Share;
import com.google.code.linkedinapi.schema.ShareTargetReach;
import com.google.code.linkedinapi.schema.Source;
import com.google.code.linkedinapi.schema.Visibility;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "timestamp",
    "comment",
    "content",
    "visibility",
    "source",
    "author",
    "attribution",
    "shareTargetReach"
})
@XmlRootElement(name = "share")
public class ShareImpl
    implements Serializable, Share
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timestamp;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true, type = ContentImpl.class)
    protected ContentImpl content;
    @XmlElement(required = true, type = VisibilityImpl.class)
    protected VisibilityImpl visibility;
    @XmlElement(required = true, type = SourceImpl.class)
    protected SourceImpl source;
    @XmlElement(required = true, type = AuthorImpl.class)
    protected AuthorImpl author;
    @XmlElement(type = AttributionImpl.class)
    protected AttributionImpl attribution;
    @XmlElement(name = "share-target-reach", type = ShareTargetReachImpl.class)
    protected ShareTargetReachImpl shareTargetReach;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long value) {
        this.timestamp = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String value) {
        this.comment = value;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content value) {
        this.content = ((ContentImpl) value);
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility value) {
        this.visibility = ((VisibilityImpl) value);
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source value) {
        this.source = ((SourceImpl) value);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author value) {
        this.author = ((AuthorImpl) value);
    }

    public Attribution getAttribution() {
        return attribution;
    }

    public void setAttribution(Attribution value) {
        this.attribution = ((AttributionImpl) value);
    }

    public ShareTargetReach getShareTargetReach() {
        return shareTargetReach;
    }

    public void setShareTargetReach(ShareTargetReach value) {
        this.shareTargetReach = ((ShareTargetReachImpl) value);
    }

}
