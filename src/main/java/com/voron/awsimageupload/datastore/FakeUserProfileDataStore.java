package com.voron.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.voron.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {
	
	private static final List<UserProfile> USER_PROFILES = new ArrayList<UserProfile>();
	
	
	static {
		USER_PROFILES.add(new UserProfile(UUID.fromString("21fafdb7-0acb-44c8-b2bd-0522f8025265"), "janatejones", null));
		USER_PROFILES.add(new UserProfile(UUID.fromString("3c88e8bc-3795-4c45-a9a4-8a8514122ef9"), "antoniojunior", null));
	}
	
	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
}
