
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
 *         &lt;element ref="{}action"/>
 *         &lt;element ref="{}original-update"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface UpdateAction
    extends SchemaEntity
{


    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    Action getAction();

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    void setAction(Action value);

    /**
     * Gets the value of the originalUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalUpdate }
     *     
     */
    OriginalUpdate getOriginalUpdate();

    /**
     * Sets the value of the originalUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalUpdate }
     *     
     */
    void setOriginalUpdate(OriginalUpdate value);

}
