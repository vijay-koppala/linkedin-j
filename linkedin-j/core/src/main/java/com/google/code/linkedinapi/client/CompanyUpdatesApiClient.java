package com.google.code.linkedinapi.client;

import com.google.code.linkedinapi.client.enumeration.CompanyUpdateType;
import com.google.code.linkedinapi.schema.Updates;
import com.google.code.linkedinapi.schema.VisibilityType;

public interface CompanyUpdatesApiClient extends LinkedInAuthenticationClient {
	
	public Updates getCompanyUpdates(String companyId);
	
	public Updates getCompanyUpdates(String companyId, CompanyUpdateType eventType);
	
	public Updates getCompanyUpdates(String companyId, CompanyUpdateType eventType, int start, int count);
	
	public String postCompanyShare(String companyId, String commentText, VisibilityType visibility);
    
    public String postCompanyShare(String companyId, String commentText, String title, String description, String url, String imageUrl, VisibilityType visibility);

}
