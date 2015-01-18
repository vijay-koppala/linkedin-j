
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.From;
import com.google.code.linkedinapi.schema.ItemContent;
import com.google.code.linkedinapi.schema.MailboxItem;
import com.google.code.linkedinapi.schema.Recipients;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "timestamp",
    "actionStatus",
    "folder",
    "from",
    "itemRead",
    "itemType",
    "lastModified",
    "messageType",
    "recipients",
    "shortBody",
    "subject",
    "body",
    "itemContent"
})
@XmlRootElement(name = "mailbox-item")
public class MailboxItemImpl
    implements Serializable, MailboxItem
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timestamp;
    @XmlElement(name = "action-status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String actionStatus;
    @XmlElement(required = true)
    protected String folder;
    @XmlElement(required = true, type = FromImpl.class)
    protected FromImpl from;
    @XmlElement(name = "item-read")
    protected boolean itemRead;
    @XmlElement(name = "item-type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String itemType;
    @XmlElement(name = "last-modified", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long lastModified;
    @XmlElement(name = "message-type", required = true)
    protected String messageType;
    @XmlElement(required = true, type = RecipientsImpl.class)
    protected RecipientsImpl recipients;
    @XmlElement(name = "short-body", required = true)
    protected String shortBody;
    @XmlElement(required = true)
    protected String subject;
    protected String body;
    @XmlElement(name = "item-content", type = ItemContentImpl.class)
    protected ItemContentImpl itemContent;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long value) {
        this.timestamp = value;
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String value) {
        this.actionStatus = value;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String value) {
        this.folder = value;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From value) {
        this.from = ((FromImpl) value);
    }

    public boolean isItemRead() {
        return itemRead;
    }

    public void setItemRead(boolean value) {
        this.itemRead = value;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String value) {
        this.itemType = value;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long value) {
        this.lastModified = value;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String value) {
        this.messageType = value;
    }

    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients value) {
        this.recipients = ((RecipientsImpl) value);
    }

    public String getShortBody() {
        return shortBody;
    }

    public void setShortBody(String value) {
        this.shortBody = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String value) {
        this.subject = value;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String value) {
        this.body = value;
    }

    public ItemContent getItemContent() {
        return itemContent;
    }

    public void setItemContent(ItemContent value) {
        this.itemContent = ((ItemContentImpl) value);
    }

}
