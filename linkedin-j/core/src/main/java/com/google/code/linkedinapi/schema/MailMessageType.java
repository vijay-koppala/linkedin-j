
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
 *     &lt;enumeration value="message-connections"/>
 *     &lt;enumeration value="group-message"/>
 *     &lt;enumeration value="news"/>
 *     &lt;enumeration value="message-group-sharing"/>
 *     &lt;enumeration value="job-super-viral-forward"/>
 *     &lt;enumeration value="reply-profile-forward-oon"/>
 *     &lt;enumeration value="reply-profile-forward"/>
 *     &lt;enumeration value="job-forward"/>
 *     &lt;enumeration value="forward-public-question"/>
 *     &lt;enumeration value="invitation-acceptance"/>
 *     &lt;enumeration value="profile-forward-oon"/>
 *     &lt;enumeration value="sponsored-inmail"/>
 *     &lt;enumeration value="group-applicant"/>
 *     &lt;enumeration value="forward-private-question"/>
 *     &lt;enumeration value="reply-answer"/>
 *     &lt;enumeration value="sharing"/>
 *     &lt;enumeration value="job-super-viral-forward"/>
 *     &lt;enumeration value="invitation-request"/>
 *     &lt;enumeration value="inmail-group-direct-connection"/>
 *     &lt;enumeration value="inmail-direct-connection"/>
 *     &lt;enumeration value="profile-forward"/>
 *     &lt;enumeration value="group-invitation"/>
 *     &lt;enumeration value="public-answer"/>
 *     &lt;enumeration value="recommendation"/>
 *     &lt;enumeration value="nudge"/>
 *     &lt;enumeration value="recommendation-request"/>
 *     &lt;enumeration value="invitation-reply"/>
 *     &lt;enumeration value="inmail-openlink"/>
 *     &lt;enumeration value="private-answer"/>
 *     &lt;enumeration value="message-welcome"/>
 *     &lt;enumeration value="introduction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum MailMessageType {

    @XmlEnumValue("message-connections")
    MESSAGE_CONNECTIONS("message-connections"),
    @XmlEnumValue("group-message")
    GROUP_MESSAGE("group-message"),
    @XmlEnumValue("news")
    NEWS("news"),
    @XmlEnumValue("message-group-sharing")
    MESSAGE_GROUP_SHARING("message-group-sharing"),
    @XmlEnumValue("job-super-viral-forward")
    JOB_SUPER_VIRAL_FORWARD("job-super-viral-forward"),
    @XmlEnumValue("reply-profile-forward-oon")
    REPLY_PROFILE_FORWARD_OON("reply-profile-forward-oon"),
    @XmlEnumValue("reply-profile-forward")
    REPLY_PROFILE_FORWARD("reply-profile-forward"),
    @XmlEnumValue("job-forward")
    JOB_FORWARD("job-forward"),
    @XmlEnumValue("forward-public-question")
    FORWARD_PUBLIC_QUESTION("forward-public-question"),
    @XmlEnumValue("invitation-acceptance")
    INVITATION_ACCEPTANCE("invitation-acceptance"),
    @XmlEnumValue("profile-forward-oon")
    PROFILE_FORWARD_OON("profile-forward-oon"),
    @XmlEnumValue("sponsored-inmail")
    SPONSORED_INMAIL("sponsored-inmail"),
    @XmlEnumValue("group-applicant")
    GROUP_APPLICANT("group-applicant"),
    @XmlEnumValue("forward-private-question")
    FORWARD_PRIVATE_QUESTION("forward-private-question"),
    @XmlEnumValue("reply-answer")
    REPLY_ANSWER("reply-answer"),
    @XmlEnumValue("sharing")
    SHARING("sharing"),
    @XmlEnumValue("invitation-request")
    INVITATION_REQUEST("invitation-request"),
    @XmlEnumValue("inmail-group-direct-connection")
    INMAIL_GROUP_DIRECT_CONNECTION("inmail-group-direct-connection"),
    @XmlEnumValue("inmail-direct-connection")
    INMAIL_DIRECT_CONNECTION("inmail-direct-connection"),
    @XmlEnumValue("profile-forward")
    PROFILE_FORWARD("profile-forward"),
    @XmlEnumValue("group-invitation")
    GROUP_INVITATION("group-invitation"),
    @XmlEnumValue("public-answer")
    PUBLIC_ANSWER("public-answer"),
    @XmlEnumValue("recommendation")
    RECOMMENDATION("recommendation"),
    @XmlEnumValue("nudge")
    NUDGE("nudge"),
    @XmlEnumValue("recommendation-request")
    RECOMMENDATION_REQUEST("recommendation-request"),
    @XmlEnumValue("invitation-reply")
    INVITATION_REPLY("invitation-reply"),
    @XmlEnumValue("inmail-openlink")
    INMAIL_OPENLINK("inmail-openlink"),
    @XmlEnumValue("private-answer")
    PRIVATE_ANSWER("private-answer"),
    @XmlEnumValue("message-welcome")
    MESSAGE_WELCOME("message-welcome"),
    @XmlEnumValue("introduction")
    INTRODUCTION("introduction");
    private final String value;

    MailMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailMessageType fromValue(String v) {
        for (MailMessageType c: MailMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
