
package com.google.code.linkedinapi.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="inbox"/>
 *     &lt;enumeration value="sent"/>
 *     &lt;enumeration value="archived"/>
 *     &lt;enumeration value="trash"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum MailFolderType {

    @XmlEnumValue("inbox")
    INBOX("inbox"),
    @XmlEnumValue("sent")
    SENT("sent"),
    @XmlEnumValue("archived")
    ARCHIVED("archived"),
    @XmlEnumValue("trash")
    TRASH("trash");
    private final String value;

    MailFolderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailFolderType fromValue(String v) {
        for (MailFolderType c: MailFolderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
