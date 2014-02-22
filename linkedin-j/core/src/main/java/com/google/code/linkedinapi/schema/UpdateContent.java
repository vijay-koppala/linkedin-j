
package com.google.code.linkedinapi.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}person" minOccurs="0"/>
 *         &lt;element ref="{}update-action" minOccurs="0"/>
 *         &lt;element ref="{}job" minOccurs="0"/>
 *         &lt;element ref="{}question" minOccurs="0"/>
 *         &lt;element ref="{}company" minOccurs="0"/>
 *         &lt;element ref="{}company-job-update" minOccurs="0"/>
 *         &lt;element ref="{}company-status-update" minOccurs="0"/>
 *         &lt;element ref="{}company-person-update" minOccurs="0"/>
 *         &lt;element ref="{}company-product-update" minOccurs="0"/>
 *         &lt;element ref="{}company-profile-update" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface UpdateContent
    extends SchemaEntity
{


    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    Person getPerson();

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    void setPerson(Person value);

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAction }
     *     
     */
    UpdateAction getUpdateAction();

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAction }
     *     
     */
    void setUpdateAction(UpdateAction value);

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    Job getJob();

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    void setJob(Job value);

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link Question }
     *     
     */
    Question getQuestion();

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link Question }
     *     
     */
    void setQuestion(Question value);

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    Company getCompany();

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    void setCompany(Company value);

    /**
     * Gets the value of the companyJobUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyJobUpdate }
     *     
     */
    CompanyJobUpdate getCompanyJobUpdate();

    /**
     * Sets the value of the companyJobUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyJobUpdate }
     *     
     */
    void setCompanyJobUpdate(CompanyJobUpdate value);

    /**
     * Gets the value of the companyStatusUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyStatusUpdate }
     *     
     */
    CompanyStatusUpdate getCompanyStatusUpdate();

    /**
     * Sets the value of the companyStatusUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyStatusUpdate }
     *     
     */
    void setCompanyStatusUpdate(CompanyStatusUpdate value);

    /**
     * Gets the value of the companyPersonUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyPersonUpdate }
     *     
     */
    CompanyPersonUpdate getCompanyPersonUpdate();

    /**
     * Sets the value of the companyPersonUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyPersonUpdate }
     *     
     */
    void setCompanyPersonUpdate(CompanyPersonUpdate value);

    /**
     * Gets the value of the companyProductUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyProductUpdate }
     *     
     */
    CompanyProductUpdate getCompanyProductUpdate();

    /**
     * Sets the value of the companyProductUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyProductUpdate }
     *     
     */
    void setCompanyProductUpdate(CompanyProductUpdate value);

    /**
     * Gets the value of the companyProfileUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyProfileUpdate }
     *     
     */
    CompanyProfileUpdate getCompanyProfileUpdate();

    /**
     * Sets the value of the companyProfileUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyProfileUpdate }
     *     
     */
    void setCompanyProfileUpdate(CompanyProfileUpdate value);

}
