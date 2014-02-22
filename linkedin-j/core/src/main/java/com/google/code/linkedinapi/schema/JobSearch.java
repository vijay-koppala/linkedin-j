
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
 *         &lt;element ref="{}jobs"/>
 *         &lt;element ref="{}facets"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface JobSearch
    extends SchemaEntity
{


    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link Jobs }
     *     
     */
    Jobs getJobs();

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jobs }
     *     
     */
    void setJobs(Jobs value);

    /**
     * Gets the value of the facets property.
     * 
     * @return
     *     possible object is
     *     {@link Facets }
     *     
     */
    Facets getFacets();

    /**
     * Sets the value of the facets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facets }
     *     
     */
    void setFacets(Facets value);

}
