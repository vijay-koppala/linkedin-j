
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.Mailbox;
import com.google.code.linkedinapi.schema.MailboxItem;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mailboxItemList"
})
@XmlRootElement(name = "mailbox")
public class MailboxImpl
    implements Serializable, Mailbox
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "mailbox-item", required = true, type = MailboxItemImpl.class)
    protected List<MailboxItem> mailboxItemList;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long count;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long start;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long total;

    public List<MailboxItem> getMailboxItemList() {
        if (mailboxItemList == null) {
            mailboxItemList = new ArrayList<MailboxItem>();
        }
        return this.mailboxItemList;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long value) {
        this.count = value;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long value) {
        this.start = value;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

}
