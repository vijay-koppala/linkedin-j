
package com.google.code.linkedinapi.schema;

import java.util.List;


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
 *         &lt;element ref="{}update" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Updates
    extends SchemaEntity
{


    /**
     * Gets the value of the update property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the update property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Update }
     * 
     * 
     */
    List<Update> getUpdate();

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getCount();

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCount(Long value);

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getStart();

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStart(Long value);

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTotal();

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTotal(Long value);

}
