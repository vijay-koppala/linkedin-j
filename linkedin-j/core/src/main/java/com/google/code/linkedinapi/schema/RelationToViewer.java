
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
 *         &lt;element ref="{}num-related-connections"/>
 *         &lt;element ref="{}related-connections"/>
 *         &lt;element ref="{}distance"/>
 *         &lt;element ref="{}membership-state" minOccurs="0"/>
 *         &lt;element ref="{}is-following"/>
 *         &lt;element ref="{}is-liked"/>
 *         &lt;element ref="{}available-actions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface RelationToViewer
    extends SchemaEntity
{


    /**
     * Gets the value of the numRelatedConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getNumRelatedConnections();

    /**
     * Sets the value of the numRelatedConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumRelatedConnections(Long value);

    /**
     * Gets the value of the relatedConnections property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedConnections }
     *     
     */
    RelatedConnections getRelatedConnections();

    /**
     * Sets the value of the relatedConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedConnections }
     *     
     */
    void setRelatedConnections(RelatedConnections value);

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getDistance();

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDistance(Long value);

    /**
     * Gets the value of the membershipState property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipState }
     *     
     */
    MembershipState getMembershipState();

    /**
     * Sets the value of the membershipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipState }
     *     
     */
    void setMembershipState(MembershipState value);

    /**
     * Gets the value of the isFollowing property.
     * 
     */
    boolean isIsFollowing();

    /**
     * Sets the value of the isFollowing property.
     * 
     */
    void setIsFollowing(boolean value);

    /**
     * Gets the value of the isLiked property.
     * 
     */
    boolean isIsLiked();

    /**
     * Sets the value of the isLiked property.
     * 
     */
    void setIsLiked(boolean value);

    /**
     * Gets the value of the availableActions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableActions }
     *     
     */
    AvailableActions getAvailableActions();

    /**
     * Sets the value of the availableActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableActions }
     *     
     */
    void setAvailableActions(AvailableActions value);

}
