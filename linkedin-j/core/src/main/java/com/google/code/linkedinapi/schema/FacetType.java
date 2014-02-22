
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
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="industry"/>
 *     &lt;enumeration value="network"/>
 *     &lt;enumeration value="language"/>
 *     &lt;enumeration value="current-company"/>
 *     &lt;enumeration value="past-company"/>
 *     &lt;enumeration value="school"/>
 *     &lt;enumeration value="company-size"/>
 *     &lt;enumeration value="num-followers-range"/>
 *     &lt;enumeration value="fortune"/>
 *     &lt;enumeration value="company"/>
 *     &lt;enumeration value="date-posted"/>
 *     &lt;enumeration value="job-function"/>
 *     &lt;enumeration value="experience-level"/>
 *     &lt;enumeration value="salary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum FacetType {

    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("industry")
    INDUSTRY("industry"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("language")
    LANGUAGE("language"),
    @XmlEnumValue("current-company")
    CURRENT_COMPANY("current-company"),
    @XmlEnumValue("past-company")
    PAST_COMPANY("past-company"),
    @XmlEnumValue("school")
    SCHOOL("school"),
    @XmlEnumValue("company-size")
    COMPANY_SIZE("company-size"),
    @XmlEnumValue("num-followers-range")
    NUM_FOLLOWERS_RANGE("num-followers-range"),
    @XmlEnumValue("fortune")
    FORTUNE("fortune"),
    @XmlEnumValue("company")
    COMPANY("company"),
    @XmlEnumValue("date-posted")
    DATE_POSTED("date-posted"),
    @XmlEnumValue("job-function")
    JOB_FUNCTION("job-function"),
    @XmlEnumValue("experience-level")
    EXPERIENCE_LEVEL("experience-level"),
    @XmlEnumValue("salary")
    SALARY("salary");
    private final String value;

    FacetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacetType fromValue(String v) {
        for (FacetType c: FacetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
