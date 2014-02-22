
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
 *     &lt;enumeration value="business-partner"/>
 *     &lt;enumeration value="colleague"/>
 *     &lt;enumeration value="education"/>
 *     &lt;enumeration value="service-provider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum RecommendationCode {

    @XmlEnumValue("business-partner")
    BUSINESS_PARTNER("business-partner"),
    @XmlEnumValue("colleague")
    COLLEAGUE("colleague"),
    @XmlEnumValue("education")
    EDUCATION("education"),
    @XmlEnumValue("service-provider")
    SERVICE_PROVIDER("service-provider");
    private final String value;

    RecommendationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecommendationCode fromValue(String v) {
        for (RecommendationCode c: RecommendationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
