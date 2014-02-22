
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
 *         &lt;element ref="{}is-applied"/>
 *         &lt;element ref="{}is-saved"/>
 *         &lt;element ref="{}saved-timestamp"/>
 *         &lt;element ref="{}applied-timestamp" minOccurs="0"/>
 *         &lt;element ref="{}job"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface JobBookmark
    extends SchemaEntity
{


    /**
     * Gets the value of the isApplied property.
     * 
     */
    boolean isIsApplied();

    /**
     * Sets the value of the isApplied property.
     * 
     */
    void setIsApplied(boolean value);

    /**
     * Gets the value of the isSaved property.
     * 
     */
    boolean isIsSaved();

    /**
     * Sets the value of the isSaved property.
     * 
     */
    void setIsSaved(boolean value);

    /**
     * Gets the value of the savedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getSavedTimestamp();

    /**
     * Sets the value of the savedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSavedTimestamp(Long value);

    /**
     * Gets the value of the appliedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getAppliedTimestamp();

    /**
     * Sets the value of the appliedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAppliedTimestamp(Long value);

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

}
