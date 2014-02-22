
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.Comments;
import com.google.code.linkedinapi.schema.Date;
import com.google.code.linkedinapi.schema.Likes;
import com.google.code.linkedinapi.schema.ViewByMonth;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "date",
    "clicks",
    "likes",
    "comments",
    "shares",
    "impressions",
    "engagement"
})
@XmlRootElement(name = "view-by-month")
public class ViewByMonthImpl
    implements Serializable, ViewByMonth
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = DateImpl.class)
    protected DateImpl date;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long clicks;
    @XmlElement(type = LikesImpl.class)
    protected LikesImpl likes;
    @XmlElement(type = CommentsImpl.class)
    protected CommentsImpl comments;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long shares;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long impressions;
    protected BigDecimal engagement;

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = ((DateImpl) value);
    }

    public Long getClicks() {
        return clicks;
    }

    public void setClicks(Long value) {
        this.clicks = value;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes value) {
        this.likes = ((LikesImpl) value);
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments value) {
        this.comments = ((CommentsImpl) value);
    }

    public Long getShares() {
        return shares;
    }

    public void setShares(Long value) {
        this.shares = value;
    }

    public Long getImpressions() {
        return impressions;
    }

    public void setImpressions(Long value) {
        this.impressions = value;
    }

    public BigDecimal getEngagement() {
        return engagement;
    }

    public void setEngagement(BigDecimal value) {
        this.engagement = value;
    }

}
