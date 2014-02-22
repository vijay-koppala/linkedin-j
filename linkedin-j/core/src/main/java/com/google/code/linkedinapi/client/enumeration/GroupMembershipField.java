/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.linkedinapi.client.enumeration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Nabeel Mukhtar
 *
 */
public enum GroupMembershipField implements CompositeEnum<GroupMembershipField> {

	PERSON("person", null),
	
	GROUP("group", null),
	
	GROUP_ID("id", GROUP),
	
	GROUP_NAME("name", GROUP),
	
	GROUP_SHORT_DESCRIPTION("short-description", GROUP),
	
    GROUP_DESCRIPTION("description", GROUP),
    
    GROUP_VIEWER("relation-to-viewer", GROUP),
    
    GROUP_VIEWER_STATE("membership-state",GROUP_VIEWER),
    
    GROUP_VIEWER_ACTIONS("available-actions",GROUP_VIEWER),
    
    GROUP_COUNTS_BY_CATEGORY("counts-by-category", GROUP),
    
    GROUP_IS_OPEN_TO_NON_MEMBERS("is-open-to-non-members", GROUP),
    
    GROUP_CATEGORY("category", GROUP),
    
    GROUP_WEBSITE_URL("website-url", GROUP),
    
    GROUP_GROUP_SITE_GROUP_URL("site-group-url", GROUP),
    
    GROUP_CONTACT_EMAIL("contact-email", GROUP),
    
    GROUP_LOCALE("locale", GROUP),
    
    GROUP_LOCATION("location", GROUP),
    
    GROUP_LOCATION_COUNTRY("country", GROUP_LOCATION),
    
    GROUP_LOCATION_POSTAL_CODE("postal-code", GROUP_LOCATION),
    
    GROUP_ALLOW_MEMBER_INVITES("allow-member-invites", GROUP),
    
    GROUP_SMALL_LOGO_URL("small-logo-url", GROUP),
    
    GROUP_LARGE_LOGO_URL("large-logo-url", GROUP),

	MEMBERSHIP_STATE("membership-state", null),
	
	CONTACT_EMAIL("contact-email", null),
	
	SHOW_GROUP_LOGO_IN_PROFILE("show-group-logo-in-profile", null),

	ALLOW_MESSAGES_FROM_MEMBERS("allow-messages-from-members", null),
	
	EMAIL_DIGEST_FREQUENCY("email-digest-frequency", null),
	
	EMAIL_ANNOUNCEMENTS_FROM_MANAGERS("email-announcements-from-managers", null),
	
	EMAIL_FOR_EVERY_NEW_POST("email-for-every-new-post", null),
	
	POSTS("posts", null);
    
    /**
     * Field Description.
     */
	private static final Map<String, GroupMembershipField> stringToEnum = new HashMap<String, GroupMembershipField>();

	static { // Initialize map from constant name to enum constant
		for (GroupMembershipField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final GroupMembershipField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    GroupMembershipField(String name, GroupMembershipField parent) {
        this.fieldName = name;
        this.parent = parent;
    }

    /**
     * @return the name of the field
     */
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
	 * @return Returns ProfileType for string, or null if string is invalid
	 */
	public static GroupMembershipField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
	
	/**
	 *
	 * @return Returns GroupFields available for connections.
	 */
	public static Set<GroupMembershipField> valuesForConnections() {
		final Set<GroupMembershipField> valuesForConnections = new HashSet<GroupMembershipField>();
		for (GroupMembershipField field : values()) {
			valuesForConnections.add(field);
		}
		return valuesForConnections;
	}

	@Override
	public GroupMembershipField parent() {
		return parent;
	}
}
