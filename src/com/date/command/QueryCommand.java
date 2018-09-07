package com.date.command;

import com.date.GeekDatesInfo;
import com.date.ProfileManager;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class QueryCommand implements  CommandModel {

    @Override
    public String execute(HttpServletRequest request) {
        String name = request.getParameter("query");
        List<GeekDatesInfo> matchedProfiles = ProfileManager.getInstance().getProfiles(name);

        request.setAttribute("userProfiles", matchedProfiles);
        return "views/profiles";
    }
}
