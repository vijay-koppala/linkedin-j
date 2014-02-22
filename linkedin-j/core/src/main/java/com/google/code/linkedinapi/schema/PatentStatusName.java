
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
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="Patent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum PatentStatusName {

    @XmlEnumValue("Application")
    PATENT_APPLICATION("Application"),
    @XmlEnumValue("Patent")
    PATENT_GRANTED("Patent");
    private final String value;

    PatentStatusName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentStatusName fromValue(String v) {
        for (PatentStatusName c: PatentStatusName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
