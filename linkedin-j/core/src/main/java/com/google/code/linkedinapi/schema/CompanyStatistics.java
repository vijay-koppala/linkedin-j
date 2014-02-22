
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
 *         &lt;element ref="{}status-update-statistics"/>
 *         &lt;element ref="{}follow-statistics"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface CompanyStatistics
    extends SchemaEntity
{


    /**
     * Gets the value of the statusUpdateStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link StatusUpdateStatistics }
     *     
     */
    StatusUpdateStatistics getStatusUpdateStatistics();

    /**
     * Sets the value of the statusUpdateStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusUpdateStatistics }
     *     
     */
    void setStatusUpdateStatistics(StatusUpdateStatistics value);

    /**
     * Gets the value of the followStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link FollowStatistics }
     *     
     */
    FollowStatistics getFollowStatistics();

    /**
     * Sets the value of the followStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowStatistics }
     *     
     */
    void setFollowStatistics(FollowStatistics value);

}
