package com.google.code.linkedinapi.client;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.code.linkedinapi.client.constant.TestConstants;
import com.google.code.linkedinapi.client.enumeration.MailFolderRequestType;
import com.google.code.linkedinapi.client.enumeration.MailMessageRequestType;
import com.google.code.linkedinapi.client.enumeration.MailboxField;
import com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient;
import com.google.code.linkedinapi.client.oauth.LinkedInAccessToken;
import com.google.code.linkedinapi.schema.Mailbox;
import com.google.code.linkedinapi.schema.MailboxItem;

public class MailboxApiClientTest extends TestCase {
	
    /** Field description */
    protected LinkedInApiClientFactory factory;

    /** Field description */
    protected LinkedInAccessToken accessToken;
    
    protected LinkedInApiClient client;
    
    /** Field description */
	protected static final String RESOURCE_MISSING_MESSAGE = "Please define a test %s in TestConstants.properties file."; 
    

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Consumer Key"), TestConstants.LINKED_IN_TEST_CONSUMER_KEY);
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Consumer Secret"), TestConstants.LINKED_IN_TEST_CONSUMER_SECRET);
    	factory =
            LinkedInApiClientFactory.newInstance(TestConstants.LINKED_IN_TEST_CONSUMER_KEY,
                TestConstants.LINKED_IN_TEST_CONSUMER_SECRET);
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Access Token Key"), TestConstants.LINKED_IN_TEST_ACCESS_TOKEN_KEY);
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Access Token Secret"), TestConstants.LINKED_IN_TEST_ACCESS_TOKEN_SECRET);
    	accessToken =
            new LinkedInAccessToken(TestConstants.LINKED_IN_TEST_ACCESS_TOKEN_KEY,
                                    TestConstants.LINKED_IN_TEST_ACCESS_TOKEN_SECRET);
    	
    	client = factory.createLinkedInApiClient(LinkedInApiJaxbClient.class, accessToken);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    	factory = null;
    	accessToken = null;
    	client = null;
    }

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetMailbox() {
		Set<MailMessageRequestType> messageTypes = new HashSet<MailMessageRequestType>();
		for(MailMessageRequestType type: MailMessageRequestType.values()) {
			messageTypes.add(type);
		}
		
		Set<MailboxField> mailboxFields = new HashSet<MailboxField>(Arrays.asList(MailboxField.values()));
		
		Mailbox mailbox = client.getMailbox(MailFolderRequestType.INBOX, messageTypes, mailboxFields, 0, 50, getLastWeekDate());
		for(MailboxItem item : mailbox.getMailboxItemList()) {
			System.out.println("------------------------------------" + item.getId());
			System.out.println(item.getActionStatus());
			System.out.println(item.getBody());
			System.out.println(item.getItemType());
			System.out.println(item.getShortBody());
			System.out.println(item.getSubject());
			System.out.println(item.getFolder());
			System.out.println(item.getFrom().getPerson().getFirstName() + " " + item.getFrom().getPerson().getLastName());
			System.out.println(item.getLastModified());
			System.out.println(item.getMessageType());
			System.out.println(item.getTimestamp());
			System.out.println("------------------------------------" + item.getId());
		}
	}
	
	/**
	 * 
	 */
	protected Date getCurrentDate() {
		return new Date();
	}

	/**
	 * 
	 */
	protected Date getLastWeekDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		return calendar.getTime();
	}

}
