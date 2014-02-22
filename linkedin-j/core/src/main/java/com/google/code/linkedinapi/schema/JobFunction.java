
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
 *               &lt;enumeration value="acct"/>
 *               &lt;enumeration value="adm"/>
 *               &lt;enumeration value="advr"/>
 *               &lt;enumeration value="anls"/>
 *               &lt;enumeration value="art"/>
 *               &lt;enumeration value="bd"/>
 *               &lt;enumeration value="cnsl"/>
 *               &lt;enumeration value="cust"/>
 *               &lt;enumeration value="dist"/>
 *               &lt;enumeration value="dsgn"/>
 *               &lt;enumeration value="edu"/>
 *               &lt;enumeration value="eng"/>
 *               &lt;enumeration value="fin"/>
 *               &lt;enumeration value="genb"/>
 *               &lt;enumeration value="hr"/>
 *               &lt;enumeration value="it"/>
 *               &lt;enumeration value="lgl"/>
 *               &lt;enumeration value="mgmt"/>
 *               &lt;enumeration value="mnfc"/>
 *               &lt;enumeration value="mrkt"/>
 *               &lt;enumeration value="othr"/>
 *               &lt;enumeration value="pr"/>
 *               &lt;enumeration value="prch"/>
 *               &lt;enumeration value="prdm"/>
 *               &lt;enumeration value="prjm"/>
 *               &lt;enumeration value="prod"/>
 *               &lt;enumeration value="qa"/>
 *               &lt;enumeration value="rsch"/>
 *               &lt;enumeration value="sale"/>
 *               &lt;enumeration value="sci"/>
 *               &lt;enumeration value="stra"/>
 *               &lt;enumeration value="supl"/>
 *               &lt;enumeration value="trng"/>
 *               &lt;enumeration value="wrt"/>
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
public interface JobFunction
    extends SchemaEntity
{


    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JobFunctionCode }
     *     
     */
    JobFunctionCode getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFunctionCode }
     *     
     */
    void setCode(JobFunctionCode value);

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
