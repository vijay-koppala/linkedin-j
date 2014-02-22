
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
 *         &lt;element name="type" type="{}post-type"/>
 *         &lt;element ref="{}category" minOccurs="0"/>
 *         &lt;element ref="{}creation-timestamp"/>
 *         &lt;element ref="{}creator"/>
 *         &lt;element ref="{}summary"/>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}likes"/>
 *         &lt;element ref="{}relation-to-viewer"/>
 *         &lt;element ref="{}attachment"/>
 *         &lt;element ref="{}comments"/>
 *         &lt;element ref="{}site-group-post-url" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Post
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PostType }
     *     
     */
    PostType getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostType }
     *     
     */
    void setType(PostType value);

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    Category getCategory();

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    void setCategory(Category value);

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getCreationTimestamp();

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCreationTimestamp(Long value);

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Creator }
     *     
     */
    Creator getCreator();

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creator }
     *     
     */
    void setCreator(Creator value);

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSummary();

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSummary(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

    /**
     * Gets the value of the likes property.
     * 
     * @return
     *     possible object is
     *     {@link Likes }
     *     
     */
    Likes getLikes();

    /**
     * Sets the value of the likes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Likes }
     *     
     */
    void setLikes(Likes value);

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
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    Attachment getAttachment();

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    void setAttachment(Attachment value);

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    Comments getComments();

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    void setComments(Comments value);

    /**
     * Gets the value of the siteGroupPostUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSiteGroupPostUrl();

    /**
     * Sets the value of the siteGroupPostUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSiteGroupPostUrl(String value);

}
