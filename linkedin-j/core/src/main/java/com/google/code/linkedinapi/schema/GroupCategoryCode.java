
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
 *     &lt;enumeration value="alumni"/>
 *     &lt;enumeration value="corporate"/>
 *     &lt;enumeration value="conference"/>
 *     &lt;enumeration value="network"/>
 *     &lt;enumeration value="philanthropic"/>
 *     &lt;enumeration value="professional"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum GroupCategoryCode {

    @XmlEnumValue("alumni")
    ALUMNI("alumni"),
    @XmlEnumValue("corporate")
    CORPORATE("corporate"),
    @XmlEnumValue("conference")
    CONFERENCE("conference"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("philanthropic")
    PHILANTHROPIC("philanthropic"),
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupCategoryCode fromValue(String v) {
        for (GroupCategoryCode c: GroupCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
