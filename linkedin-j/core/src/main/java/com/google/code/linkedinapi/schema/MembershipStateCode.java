
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
 *     &lt;enumeration value="blocked"/>
 *     &lt;enumeration value="non-member"/>
 *     &lt;enumeration value="awaiting-confirmation"/>
 *     &lt;enumeration value="awaiting-parent-group-confirmation"/>
 *     &lt;enumeration value="member"/>
 *     &lt;enumeration value="moderator"/>
 *     &lt;enumeration value="manager"/>
 *     &lt;enumeration value="owner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum MembershipStateCode {

    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("non-member")
    NON_MEMBER("non-member"),
    @XmlEnumValue("awaiting-confirmation")
    AWAITING_CONFIRMATION("awaiting-confirmation"),
    @XmlEnumValue("awaiting-parent-group-confirmation")
    AWAITING_PARENT_GROUP_CONFIRMATION("awaiting-parent-group-confirmation"),
    @XmlEnumValue("member")
    MEMBER("member"),
    @XmlEnumValue("moderator")
    MODERATOR("moderator"),
    @XmlEnumValue("manager")
    MANAGER("manager"),
    @XmlEnumValue("owner")
    OWNER("owner");
    private final String value;

    MembershipStateCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MembershipStateCode fromValue(String v) {
        for (MembershipStateCode c: MembershipStateCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
