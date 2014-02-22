
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
 *     &lt;enumeration value="anyone"/>
 *     &lt;enumeration value="all-members"/>
 *     &lt;enumeration value="connections-only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum VisibilityType {

    @XmlEnumValue("anyone")
    ANYONE("anyone"),
    @XmlEnumValue("all-members")
    ALL_MEMBERS("all-members"),
    @XmlEnumValue("connections-only")
    CONNECTIONS_ONLY("connections-only");
    private final String value;

    VisibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisibilityType fromValue(String v) {
        for (VisibilityType c: VisibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
