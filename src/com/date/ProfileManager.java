package com.date;

import java.util.ArrayList;
import java.util.List;

public class ProfileManager {
    private List<GeekDatesInfo> profiles = new ArrayList<>();

    public static ProfileManager INSTANCE;

    public static ProfileManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProfileManager();
        }
        return INSTANCE;
    }

    private ProfileManager() {
    }

    public void addProfile(String name, int age) {
        profiles.add(new GeekDatesInfo(name, age));
    }

    public void addProfile(GeekDatesInfo geekDatesInfo) {
        profiles.add(geekDatesInfo);
    }

    public List<GeekDatesInfo> getProfiles(String name) {
        List<GeekDatesInfo> matchedProfiles = new ArrayList<>();
        for (GeekDatesInfo profile : profiles) {
            if (profile.getName().equals(name)) {
                matchedProfiles.add(profile);
            }
        }
        return matchedProfiles;
    }

}
