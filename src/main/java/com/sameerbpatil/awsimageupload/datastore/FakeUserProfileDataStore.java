package com.sameerbpatil.awsimageupload.datastore;

import com.sameerbpatil.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("42547cea-10fb-4e75-aabf-b07a2367e7f4"), "sameerpatil", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("c3294f8c-7c43-4304-81b3-b1d0a6b006d3"), "snehalyadav", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
