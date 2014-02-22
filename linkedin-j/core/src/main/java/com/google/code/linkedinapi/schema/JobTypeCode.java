
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
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum JobTypeCode {

    @XmlEnumValue("F")
    FULL_TIME("F"),
    @XmlEnumValue("P")
    PART_TIME("P"),
    @XmlEnumValue("C")
    CONTRACT("C"),
    @XmlEnumValue("T")
    TEMPORARY("T"),
    @XmlEnumValue("O")
    OTHER("O");
    private final String value;

    JobTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobTypeCode fromValue(String v) {
        for (JobTypeCode c: JobTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
