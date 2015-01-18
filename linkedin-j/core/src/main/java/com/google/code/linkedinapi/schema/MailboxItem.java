
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
 *         &lt;sequence>
 *           &lt;element ref="{}id"/>
 *           &lt;element ref="{}timestamp"/>
 *           &lt;element ref="{}action-status"/>
 *           &lt;element name="folder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element ref="{}from"/>
 *           &lt;element ref="{}item-read"/>
 *           &lt;element ref="{}item-type"/>
 *           &lt;element ref="{}last-modified"/>
 *           &lt;element name="message-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element ref="{}recipients"/>
 *           &lt;element ref="{}short-body"/>
 *           &lt;element ref="{}subject"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}body" minOccurs="0"/>
 *         &lt;element ref="{}item-content" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface MailboxItem
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
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTimestamp();

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTimestamp(Long value);

    /**
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getActionStatus();

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setActionStatus(String value);

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFolder();

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFolder(String value);

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link From }
     *     
     */
    From getFrom();

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link From }
     *     
     */
    void setFrom(From value);

    /**
     * Gets the value of the itemRead property.
     * 
     */
    boolean isItemRead();

    /**
     * Sets the value of the itemRead property.
     * 
     */
    void setItemRead(boolean value);

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getItemType();

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setItemType(String value);

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getLastModified();

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLastModified(Long value);

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getMessageType();

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setMessageType(String value);

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link Recipients }
     *     
     */
    Recipients getRecipients();

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipients }
     *     
     */
    void setRecipients(Recipients value);

    /**
     * Gets the value of the shortBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getShortBody();

    /**
     * Sets the value of the shortBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setShortBody(String value);

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSubject();

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSubject(String value);

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBody();

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBody(String value);

    /**
     * Gets the value of the itemContent property.
     * 
     * @return
     *     possible object is
     *     {@link ItemContent }
     *     
     */
    ItemContent getItemContent();

    /**
     * Sets the value of the itemContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemContent }
     *     
     */
    void setItemContent(ItemContent value);

}
