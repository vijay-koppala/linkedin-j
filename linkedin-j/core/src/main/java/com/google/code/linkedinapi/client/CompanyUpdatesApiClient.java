package com.google.code.linkedinapi.client;

import com.google.code.linkedinapi.client.enumeration.CompanyUpdateType;
import com.google.code.linkedinapi.schema.Updates;

public interface CompanyUpdatesApiClient extends LinkedInAuthenticationClient {
	
	public Updates getCompanyUpdates(String companyId);
	
	public Updates getCompanyUpdates(String companyId, CompanyUpdateType eventType);
	
	public Updates getCompanyUpdates(String companyId, CompanyUpdateType eventType, int start, int count);

}
