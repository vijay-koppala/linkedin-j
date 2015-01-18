
package com.google.code.linkedinapi.client.enumeration;



public enum MailMessageRequestType {
    
    MESSAGE_CONNECTIONS("message-connections"),
    
    GROUP_MESSAGE("group-message"),
    
    NEWS("news"),
    
    MESSAGE_GROUP_SHARING("message-group-sharing"),
    
    JOB_SUPER_VIRAL_FORWARD("job-super-viral-forward"),
    
    REPLY_PROFILE_FORWARD_OON("reply-profile-forward-oon"),
    
    REPLY_PROFILE_FORWARD("reply-profile-forward"),
    
    JOB_FORWARD("job-forward"),
    
    FORWARD_PUBLIC_QUESTION("forward-public-question"),

    INVITATION_ACCEPTANCE("invitation-acceptance"),

    PROFILE_FORWARD_OON("profile-forward-oon"),

    SPONSORED_INMAIL("sponsored-inmail"),

    GROUP_APPLICANT("group-applicant"),

    FORWARD_PRIVATE_QUESTION("forward-private-question"),

    REPLY_ANSWER("reply-answer"),

    SHARING("sharing"),

    INVITATION_REQUEST("invitation-request"),

    INMAIL_GROUP_DIRECT_CONNECTION("inmail-group-direct-connection"),

    INMAIL_DIRECT_CONNECTION("inmail-direct-connection"),

    PROFILE_FORWARD("profile-forward"),

    GROUP_INVITATION("group-invitation"),

    PUBLIC_ANSWER("public-answer"),

    RECOMMENDATION("recommendation"),

    NUDGE("nudge"),

    RECOMMENDATION_REQUEST("recommendation-request"),

    INVITATION_REPLY("invitation-reply"),

    INMAIL_OPENLINK("inmail-openlink"),

    PRIVATE_ANSWER("private-answer"),

    MESSAGE_WELCOME("message-welcome"),

    INTRODUCTION("introduction");
    private final String value;

    MailMessageRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailMessageRequestType fromValue(String v) {
        for (MailMessageRequestType c: MailMessageRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
