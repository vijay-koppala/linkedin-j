
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
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}short-description"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}location"/>
 *         &lt;element ref="{}relation-to-viewer"/>
 *         &lt;element ref="{}counts-by-category"/>
 *         &lt;element ref="{}is-open-to-non-members"/>
 *         &lt;element name="category" type="{}group-category"/>
 *         &lt;element ref="{}website-url"/>
 *         &lt;element ref="{}site-group-url"/>
 *         &lt;element ref="{}contact-email"/>
 *         &lt;element ref="{}locale"/>
 *         &lt;element ref="{}allow-member-invites"/>
 *         &lt;element ref="{}small-logo-url"/>
 *         &lt;element ref="{}large-logo-url"/>
 *         &lt;element ref="{}posts"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Group
    extends SchemaEntity
{


    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

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

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getShortDescription();

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setShortDescription(String value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescription(String value);

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    Location getLocation();

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    void setLocation(Location value);

    /**
     * Gets the value of the relationToViewer property.
     * 
     * @return
     *     possible object is
     *     {@link RelationToViewer }
     *     
     */
    RelationToViewer getRelationToViewer();

    /**
     * Sets the value of the relationToViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationToViewer }
     *     
     */
    void setRelationToViewer(RelationToViewer value);

    /**
     * Gets the value of the countsByCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CountsByCategory }
     *     
     */
    CountsByCategory getCountsByCategory();

    /**
     * Sets the value of the countsByCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountsByCategory }
     *     
     */
    void setCountsByCategory(CountsByCategory value);

    /**
     * Gets the value of the isOpenToNonMembers property.
     * 
     */
    boolean isIsOpenToNonMembers();

    /**
     * Sets the value of the isOpenToNonMembers property.
     * 
     */
    void setIsOpenToNonMembers(boolean value);

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCategory }
     *     
     */
    GroupCategory getCategory();

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCategory }
     *     
     */
    void setCategory(GroupCategory value);

    /**
     * Gets the value of the websiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getWebsiteUrl();

    /**
     * Sets the value of the websiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setWebsiteUrl(String value);

    /**
     * Gets the value of the siteGroupUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSiteGroupUrl();

    /**
     * Sets the value of the siteGroupUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSiteGroupUrl(String value);

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getContactEmail();

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContactEmail(String value);

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLocale();

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLocale(String value);

    /**
     * Gets the value of the allowMemberInvites property.
     * 
     */
    boolean isAllowMemberInvites();

    /**
     * Sets the value of the allowMemberInvites property.
     * 
     */
    void setAllowMemberInvites(boolean value);

    /**
     * Gets the value of the smallLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSmallLogoUrl();

    /**
     * Sets the value of the smallLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSmallLogoUrl(String value);

    /**
     * Gets the value of the largeLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLargeLogoUrl();

    /**
     * Sets the value of the largeLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLargeLogoUrl(String value);

    /**
     * Gets the value of the posts property.
     * 
     * @return
     *     possible object is
     *     {@link Posts }
     *     
     */
    Posts getPosts();

    /**
     * Sets the value of the posts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Posts }
     *     
     */
    void setPosts(Posts value);

}
