
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
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum PatentStatusId {

    @XmlEnumValue("0")
    PATENT_APPLICATION("0"),
    @XmlEnumValue("1")
    PATENT_GRANTED("1");
    private final String value;

    PatentStatusId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentStatusId fromValue(String v) {
        for (PatentStatusId c: PatentStatusId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
