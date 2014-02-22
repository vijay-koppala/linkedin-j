
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
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="blocked"/>
 *               &lt;enumeration value="non-member"/>
 *               &lt;enumeration value="awaiting-confirmation"/>
 *               &lt;enumeration value="awaiting-parent-group-confirmation"/>
 *               &lt;enumeration value="member"/>
 *               &lt;enumeration value="moderator"/>
 *               &lt;enumeration value="manager"/>
 *               &lt;enumeration value="owner"/>
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
public interface MembershipState
    extends SchemaEntity
{


    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipStateCode }
     *     
     */
    MembershipStateCode getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipStateCode }
     *     
     */
    void setCode(MembershipStateCode value);

}
