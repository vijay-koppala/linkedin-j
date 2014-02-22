
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.EmailDigestFrequency;
import com.google.code.linkedinapi.schema.Group;
import com.google.code.linkedinapi.schema.GroupMembership;
import com.google.code.linkedinapi.schema.MembershipState;
import com.google.code.linkedinapi.schema.Person;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "group",
    "person",
    "membershipState",
    "contactEmail",
    "showGroupLogoInProfile",
    "allowMessagesFromMembers",
    "emailDigestFrequency",
    "emailAnnouncementsFromManagers",
    "emailForEveryNewPost"
})
@XmlRootElement(name = "group-membership")
public class GroupMembershipImpl
    implements Serializable, GroupMembership
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = GroupImpl.class)
    protected GroupImpl group;
    @XmlElement(required = true, type = PersonImpl.class)
    protected PersonImpl person;
    @XmlElement(name = "membership-state", required = true, type = MembershipStateImpl.class)
    protected MembershipStateImpl membershipState;
    @XmlElement(name = "contact-email", required = true)
    protected String contactEmail;
    @XmlElement(name = "show-group-logo-in-profile")
    protected boolean showGroupLogoInProfile;
    @XmlElement(name = "allow-messages-from-members")
    protected boolean allowMessagesFromMembers;
    @XmlElement(name = "email-digest-frequency", required = true, type = EmailDigestFrequencyImpl.class)
    protected EmailDigestFrequencyImpl emailDigestFrequency;
    @XmlElement(name = "email-announcements-from-managers")
    protected boolean emailAnnouncementsFromManagers;
    @XmlElement(name = "email-for-every-new-post")
    protected boolean emailForEveryNewPost;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long key;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group value) {
        this.group = ((GroupImpl) value);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person value) {
        this.person = ((PersonImpl) value);
    }

    public MembershipState getMembershipState() {
        return membershipState;
    }

    public void setMembershipState(MembershipState value) {
        this.membershipState = ((MembershipStateImpl) value);
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    public boolean isShowGroupLogoInProfile() {
        return showGroupLogoInProfile;
    }

    public void setShowGroupLogoInProfile(boolean value) {
        this.showGroupLogoInProfile = value;
    }

    public boolean isAllowMessagesFromMembers() {
        return allowMessagesFromMembers;
    }

    public void setAllowMessagesFromMembers(boolean value) {
        this.allowMessagesFromMembers = value;
    }

    public EmailDigestFrequency getEmailDigestFrequency() {
        return emailDigestFrequency;
    }

    public void setEmailDigestFrequency(EmailDigestFrequency value) {
        this.emailDigestFrequency = ((EmailDigestFrequencyImpl) value);
    }

    public boolean isEmailAnnouncementsFromManagers() {
        return emailAnnouncementsFromManagers;
    }

    public void setEmailAnnouncementsFromManagers(boolean value) {
        this.emailAnnouncementsFromManagers = value;
    }

    public boolean isEmailForEveryNewPost() {
        return emailForEveryNewPost;
    }

    public void setEmailForEveryNewPost(boolean value) {
        this.emailForEveryNewPost = value;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long value) {
        this.key = value;
    }

}
