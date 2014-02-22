
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
 *         &lt;element ref="{}application-url"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface HowToApply
    extends SchemaEntity
{


    /**
     * Gets the value of the applicationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getApplicationUrl();

    /**
     * Sets the value of the applicationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setApplicationUrl(String value);

}
