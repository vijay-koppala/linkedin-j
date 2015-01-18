
package com.google.code.linkedinapi.client.enumeration;



public enum MailFolderRequestType {

    INBOX("inbox"),
    SENT("sent"),
    ARCHIVED("archived");
    
    private final String value;

    MailFolderRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailFolderRequestType fromValue(String v) {
        for (MailFolderRequestType c: MailFolderRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
