
package com.google.code.linkedinapi.schema;



/**
 * <p>Java class for group-category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="group-category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="alumni"/>
 *               &lt;enumeration value="corporate"/>
 *               &lt;enumeration value="conference"/>
 *               &lt;enumeration value="network"/>
 *               &lt;enumeration value="philanthropic"/>
 *               &lt;enumeration value="professional"/>
 *               &lt;enumeration value="other"/>
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
public interface GroupCategory
    extends SchemaEntity
{


    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCategoryCode }
     *     
     */
    GroupCategoryCode getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCategoryCode }
     *     
     */
    void setCode(GroupCategoryCode value);

}
