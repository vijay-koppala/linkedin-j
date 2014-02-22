
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
 *         &lt;element ref="{}share"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface CompanyStatusUpdate
    extends SchemaEntity
{


    /**
     * Gets the value of the share property.
     * 
     * @return
     *     possible object is
     *     {@link Share }
     *     
     */
    Share getShare();

    /**
     * Sets the value of the share property.
     * 
     * @param value
     *     allowed object is
     *     {@link Share }
     *     
     */
    void setShare(Share value);

}
