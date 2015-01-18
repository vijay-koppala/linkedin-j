package com.google.code.linkedinapi.client.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum MailboxField implements CompositeEnum<MailboxField> {
	
	ID("id", null),
	FOLDER("folder", null),
	MESSAGE_TYPE("message-type", null),
	ITEM_TYPE("item-type", null),
	ITEM_READ("item-read", null),
	
	FROM("from", null),
	FROM_PERSON("person", FROM),
	FROM_PERSON_ID("id", FROM_PERSON),
	FROM_PERSON_FIRST_NAME("first-name", FROM_PERSON),
	FROM_PERSON_LAST_NAME("last-name", FROM_PERSON),
	FROM_PERSON_PICTURE_URL("picture-url", FROM_PERSON),
	
	RECIPIENTS("recipients",null),
	RECIPIENTS_PERSON("person", RECIPIENTS),
	RECIPIENTS_PERSON_ID("id", RECIPIENTS_PERSON),
	RECIPIENTS_PERSON_FIRST_NAME("first-name", RECIPIENTS_PERSON),
	RECIPIENTS_PERSON_LAST_NAME("last-name", RECIPIENTS_PERSON),
	RECIPIENTS_PERSON_PICTURE_URL("picture-url", RECIPIENTS_PERSON),
	
	SUBJECT("subject",null),
	SHORT_BODY("short-body",null),
	BODY("body",null),
	ACTION_STATUS("action-status", null),
	LAST_MODIFIED("last-modified",null),
	TIMESTAMP("timestamp",null);
	
	
	private static final Map<String, MailboxField> stringToEnum = new HashMap<String, MailboxField>();

	static { // Initialize map from constant name to enum constant
		for (MailboxField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}
    
    /** Field description */
    private final String fieldName;
    
    private final MailboxField parent;
    
    
    MailboxField(String name, MailboxField parent) {
        this.fieldName = name;
        this.parent = parent;
    }
    
    @Override
	public MailboxField parent() {
		return parent;
	}

	@Override
	public String fieldName() {
		return this.fieldName;
	}
	
    /**
     * Method description
     *
     *
     * @return
     */
    @Override
    public String toString() {
        return fieldName();
    }

	/**
	 *
	 * @return Returns MailboxField for string, or null if string is invalid
	 */
	public static FieldEnum fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

}
