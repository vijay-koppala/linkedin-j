
package com.google.code.linkedinapi.schema;



/**
 * <p>Java class for post-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="post-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="standard"/>
 *               &lt;enumeration value="news"/>
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
public interface PostType
    extends SchemaEntity
{


    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link PostTypeCode }
     *     
     */
    PostTypeCode getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTypeCode }
     *     
     */
    void setCode(PostTypeCode value);

}
