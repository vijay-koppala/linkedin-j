
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
 *         &lt;element ref="{}views-by-month"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface StatusUpdateStatistics
    extends SchemaEntity
{


    /**
     * Gets the value of the viewsByMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ViewsByMonth }
     *     
     */
    ViewsByMonth getViewsByMonth();

    /**
     * Sets the value of the viewsByMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewsByMonth }
     *     
     */
    void setViewsByMonth(ViewsByMonth value);

}
