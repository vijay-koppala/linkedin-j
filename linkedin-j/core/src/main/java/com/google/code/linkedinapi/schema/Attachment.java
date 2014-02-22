
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
 *         &lt;element ref="{}summary"/>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}content-domain"/>
 *         &lt;element ref="{}content-url"/>
 *         &lt;element ref="{}image-url"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Attachment
    extends SchemaEntity
{


    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSummary();

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSummary(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

    /**
     * Gets the value of the contentDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getContentDomain();

    /**
     * Sets the value of the contentDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContentDomain(String value);

    /**
     * Gets the value of the contentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getContentUrl();

    /**
     * Sets the value of the contentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContentUrl(String value);

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getImageUrl();

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setImageUrl(String value);

}
