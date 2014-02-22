
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
 *         &lt;element ref="{}share-targets"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ShareTargetReach
    extends SchemaEntity
{


    /**
     * Gets the value of the shareTargets property.
     * 
     * @return
     *     possible object is
     *     {@link ShareTargets }
     *     
     */
    ShareTargets getShareTargets();

    /**
     * Sets the value of the shareTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareTargets }
     *     
     */
    void setShareTargets(ShareTargets value);

}
