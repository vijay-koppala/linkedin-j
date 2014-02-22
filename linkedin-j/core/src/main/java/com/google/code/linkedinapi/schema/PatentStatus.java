
package com.google.code.linkedinapi.schema;



/**
 * <p>Java class for patent-status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patent-status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Application"/>
 *               &lt;enumeration value="Patent"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface PatentStatus
    extends SchemaEntity
{


    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PatentStatusName }
     *     
     */
    PatentStatusName getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentStatusName }
     *     
     */
    void setName(PatentStatusName value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PatentStatusId }
     *     
     */
    PatentStatusId getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentStatusId }
     *     
     */
    void setId(PatentStatusId value);

}
