
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
 *         &lt;element ref="{}entry-key"/>
 *         &lt;element ref="{}entry-value"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Seniority
    extends SchemaEntity
{


    /**
     * Gets the value of the entryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getEntryKey();

    /**
     * Sets the value of the entryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEntryKey(Long value);

    /**
     * Gets the value of the entryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getEntryValue();

    /**
     * Sets the value of the entryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEntryValue(Long value);

}
