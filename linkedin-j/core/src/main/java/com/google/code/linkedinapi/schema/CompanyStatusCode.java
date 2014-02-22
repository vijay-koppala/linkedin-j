
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
 *     &lt;enumeration value="OPR"/>
 *     &lt;enumeration value="OPS"/>
 *     &lt;enumeration value="RRG"/>
 *     &lt;enumeration value="OOB"/>
 *     &lt;enumeration value="ACQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum CompanyStatusCode {

    @XmlEnumValue("OPR")
    OPERATING("OPR"),
    @XmlEnumValue("OPS")
    OPERATING_SUBSIDIARY("OPS"),
    @XmlEnumValue("RRG")
    REORGANIZING("RRG"),
    @XmlEnumValue("OOB")
    OUT_OF_BUSINESS("OOB"),
    @XmlEnumValue("ACQ")
    ACQUIRED("ACQ");
    private final String value;

    CompanyStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyStatusCode fromValue(String v) {
        for (CompanyStatusCode c: CompanyStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
