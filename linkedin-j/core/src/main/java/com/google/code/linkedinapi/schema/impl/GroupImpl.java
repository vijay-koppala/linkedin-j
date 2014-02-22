
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
import com.google.code.linkedinapi.schema.CountsByCategory;
import com.google.code.linkedinapi.schema.Group;
import com.google.code.linkedinapi.schema.GroupCategory;
import com.google.code.linkedinapi.schema.Location;
import com.google.code.linkedinapi.schema.Posts;
import com.google.code.linkedinapi.schema.RelationToViewer;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "shortDescription",
    "description",
    "location",
    "relationToViewer",
    "countsByCategory",
    "isOpenToNonMembers",
    "category",
    "websiteUrl",
    "siteGroupUrl",
    "contactEmail",
    "locale",
    "allowMemberInvites",
    "smallLogoUrl",
    "largeLogoUrl",
    "posts"
})
@XmlRootElement(name = "group")
public class GroupImpl
    implements Serializable, Group
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "short-description", required = true)
    protected String shortDescription;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true, type = LocationImpl.class)
    protected LocationImpl location;
    @XmlElement(name = "relation-to-viewer", required = true, type = RelationToViewerImpl.class)
    protected RelationToViewerImpl relationToViewer;
    @XmlElement(name = "counts-by-category", required = true, type = CountsByCategoryImpl.class)
    protected CountsByCategoryImpl countsByCategory;
    @XmlElement(name = "is-open-to-non-members")
    protected boolean isOpenToNonMembers;
    @XmlElement(required = true, type = GroupCategoryImpl.class)
    protected GroupCategoryImpl category;
    @XmlElement(name = "website-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String websiteUrl;
    @XmlElement(name = "site-group-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String siteGroupUrl;
    @XmlElement(name = "contact-email", required = true)
    protected String contactEmail;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String locale;
    @XmlElement(name = "allow-member-invites")
    protected boolean allowMemberInvites;
    @XmlElement(name = "small-logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String smallLogoUrl;
    @XmlElement(name = "large-logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String largeLogoUrl;
    @XmlElement(required = true, type = PostsImpl.class)
    protected PostsImpl posts;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location value) {
        this.location = ((LocationImpl) value);
    }

    public RelationToViewer getRelationToViewer() {
        return relationToViewer;
    }

    public void setRelationToViewer(RelationToViewer value) {
        this.relationToViewer = ((RelationToViewerImpl) value);
    }

    public CountsByCategory getCountsByCategory() {
        return countsByCategory;
    }

    public void setCountsByCategory(CountsByCategory value) {
        this.countsByCategory = ((CountsByCategoryImpl) value);
    }

    public boolean isIsOpenToNonMembers() {
        return isOpenToNonMembers;
    }

    public void setIsOpenToNonMembers(boolean value) {
        this.isOpenToNonMembers = value;
    }

    public GroupCategory getCategory() {
        return category;
    }

    public void setCategory(GroupCategory value) {
        this.category = ((GroupCategoryImpl) value);
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String value) {
        this.websiteUrl = value;
    }

    public String getSiteGroupUrl() {
        return siteGroupUrl;
    }

    public void setSiteGroupUrl(String value) {
        this.siteGroupUrl = value;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String value) {
        this.locale = value;
    }

    public boolean isAllowMemberInvites() {
        return allowMemberInvites;
    }

    public void setAllowMemberInvites(boolean value) {
        this.allowMemberInvites = value;
    }

    public String getSmallLogoUrl() {
        return smallLogoUrl;
    }

    public void setSmallLogoUrl(String value) {
        this.smallLogoUrl = value;
    }

    public String getLargeLogoUrl() {
        return largeLogoUrl;
    }

    public void setLargeLogoUrl(String value) {
        this.largeLogoUrl = value;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts value) {
        this.posts = ((PostsImpl) value);
    }

}
