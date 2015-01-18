package com.google.code.linkedinapi.client;

import java.util.Date;
import java.util.Set;

import com.google.code.linkedinapi.client.enumeration.MailFolderRequestType;
import com.google.code.linkedinapi.client.enumeration.MailMessageRequestType;
import com.google.code.linkedinapi.client.enumeration.MailboxField;
import com.google.code.linkedinapi.schema.Mailbox;

public interface MailboxApiClient extends LinkedInAuthenticationClient {
	
	public Mailbox getMailbox(MailFolderRequestType requestFolderType, Set<MailMessageRequestType> messageTypes, Set<MailboxField> mailboxFields, int start, int count, Date modifiedSince);

}
