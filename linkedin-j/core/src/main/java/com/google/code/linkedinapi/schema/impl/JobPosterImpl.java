
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
import com.google.code.linkedinapi.schema.ApiStandardProfileRequest;
import com.google.code.linkedinapi.schema.JobPoster;
import com.google.code.linkedinapi.schema.RelationToViewer;
import com.google.code.linkedinapi.schema.SiteStandardProfileRequest;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "firstName",
    "lastName",
    "headline",
    "relationToViewer",
    "apiStandardProfileRequest",
    "siteStandardProfileRequest"
})
@XmlRootElement(name = "job-poster")
public class JobPosterImpl
    implements Serializable, JobPoster
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(name = "first-name", required = true)
    protected String firstName;
    @XmlElement(name = "last-name", required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String headline;
    @XmlElement(name = "relation-to-viewer", type = RelationToViewerImpl.class)
    protected RelationToViewerImpl relationToViewer;
    @XmlElement(name = "api-standard-profile-request", type = ApiStandardProfileRequestImpl.class)
    protected ApiStandardProfileRequestImpl apiStandardProfileRequest;
    @XmlElement(name = "site-standard-profile-request", type = SiteStandardProfileRequestImpl.class)
    protected SiteStandardProfileRequestImpl siteStandardProfileRequest;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String value) {
        this.headline = value;
    }

    public RelationToViewer getRelationToViewer() {
        return relationToViewer;
    }

    public void setRelationToViewer(RelationToViewer value) {
        this.relationToViewer = ((RelationToViewerImpl) value);
    }

    public ApiStandardProfileRequest getApiStandardProfileRequest() {
        return apiStandardProfileRequest;
    }

    public void setApiStandardProfileRequest(ApiStandardProfileRequest value) {
        this.apiStandardProfileRequest = ((ApiStandardProfileRequestImpl) value);
    }

    public SiteStandardProfileRequest getSiteStandardProfileRequest() {
        return siteStandardProfileRequest;
    }

    public void setSiteStandardProfileRequest(SiteStandardProfileRequest value) {
        this.siteStandardProfileRequest = ((SiteStandardProfileRequestImpl) value);
    }

}
