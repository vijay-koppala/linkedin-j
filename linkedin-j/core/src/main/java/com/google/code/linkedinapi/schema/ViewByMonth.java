
package com.google.code.linkedinapi.schema;

import java.math.BigDecimal;


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
 *         &lt;element ref="{}date"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="clicks" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element ref="{}likes"/>
 *           &lt;element ref="{}comments"/>
 *           &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}engagement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ViewByMonth
    extends SchemaEntity
{


    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    Date getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    void setDate(Date value);

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getClicks();

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setClicks(Long value);

    /**
     * Gets the value of the likes property.
     * 
     * @return
     *     possible object is
     *     {@link Likes }
     *     
     */
    Likes getLikes();

    /**
     * Sets the value of the likes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Likes }
     *     
     */
    void setLikes(Likes value);

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    Comments getComments();

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    void setComments(Comments value);

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getShares();

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setShares(Long value);

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getImpressions();

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setImpressions(Long value);

    /**
     * Gets the value of the engagement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    BigDecimal getEngagement();

    /**
     * Sets the value of the engagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    void setEngagement(BigDecimal value);

}
