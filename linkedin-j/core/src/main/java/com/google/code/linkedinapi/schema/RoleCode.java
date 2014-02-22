
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
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum RoleCode {

    @XmlEnumValue("H")
    HIRING_MANAGER("H"),
    @XmlEnumValue("R")
    COMPANY_RECRUITER("R"),
    @XmlEnumValue("S")
    STAFFING_FIRM("S"),
    @XmlEnumValue("W")
    COMPANY_EMPLOYEE("W");
    private final String value;

    RoleCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleCode fromValue(String v) {
        for (RoleCode c: RoleCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
