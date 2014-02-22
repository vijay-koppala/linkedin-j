
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
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}timestamp"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;element ref="{}content"/>
 *         &lt;element ref="{}visibility"/>
 *         &lt;element ref="{}source"/>
 *         &lt;element ref="{}author"/>
 *         &lt;element ref="{}attribution" minOccurs="0"/>
 *         &lt;element ref="{}share-target-reach" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Share
    extends SchemaEntity
{


    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTimestamp();

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTimestamp(Long value);

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getComment();

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setComment(String value);

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    Content getContent();

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    void setContent(Content value);

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    Visibility getVisibility();

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    void setVisibility(Visibility value);

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    Source getSource();

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    void setSource(Source value);

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link Author }
     *     
     */
    Author getAuthor();

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link Author }
     *     
     */
    void setAuthor(Author value);

    /**
     * Gets the value of the attribution property.
     * 
     * @return
     *     possible object is
     *     {@link Attribution }
     *     
     */
    Attribution getAttribution();

    /**
     * Sets the value of the attribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribution }
     *     
     */
    void setAttribution(Attribution value);

    /**
     * Gets the value of the shareTargetReach property.
     * 
     * @return
     *     possible object is
     *     {@link ShareTargetReach }
     *     
     */
    ShareTargetReach getShareTargetReach();

    /**
     * Sets the value of the shareTargetReach property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareTargetReach }
     *     
     */
    void setShareTargetReach(ShareTargetReach value);

}
