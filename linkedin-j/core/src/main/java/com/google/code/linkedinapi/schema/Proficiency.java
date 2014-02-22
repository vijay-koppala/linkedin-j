
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
 *         &lt;element name="level">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="elementary"/>
 *               &lt;enumeration value="limited_working"/>
 *               &lt;enumeration value="professional_working"/>
 *               &lt;enumeration value="full_professional"/>
 *               &lt;enumeration value="native_or_bilingual"/>
 *               &lt;enumeration value="beginner"/>
 *               &lt;enumeration value="intermediate"/>
 *               &lt;enumeration value="advanced"/>
 *               &lt;enumeration value="expert"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}name"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Proficiency
    extends SchemaEntity
{


    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link ProficiencyLevelType }
     *     
     */
    ProficiencyLevelType getLevel();

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProficiencyLevelType }
     *     
     */
    void setLevel(ProficiencyLevelType value);

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);

}
