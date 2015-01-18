
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.MailboxItem;
import com.google.code.linkedinapi.schema.MailboxItems;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mailboxItem"
})
@XmlRootElement(name = "mailbox-items")
public class MailboxItemsImpl
    implements Serializable, MailboxItems
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "mailbox-item", required = true, type = MailboxItemImpl.class)
    protected List<MailboxItem> mailboxItem;

    public List<MailboxItem> getMailboxItem() {
        if (mailboxItem == null) {
            mailboxItem = new ArrayList<MailboxItem>();
        }
        return this.mailboxItem;
    }

}
