
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
 *         &lt;element ref="{}count"/>
 *         &lt;element ref="{}employee-count"/>
 *         &lt;element ref="{}non-employee-count"/>
 *         &lt;element ref="{}seniorities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface FollowStatistics
    extends SchemaEntity
{


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
     * Gets the value of the employeeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getEmployeeCount();

    /**
     * Sets the value of the employeeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEmployeeCount(Long value);

    /**
     * Gets the value of the nonEmployeeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getNonEmployeeCount();

    /**
     * Sets the value of the nonEmployeeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNonEmployeeCount(Long value);

    /**
     * Gets the value of the seniorities property.
     * 
     * @return
     *     possible object is
     *     {@link Seniorities }
     *     
     */
    Seniorities getSeniorities();

    /**
     * Sets the value of the seniorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seniorities }
     *     
     */
    void setSeniorities(Seniorities value);

}
