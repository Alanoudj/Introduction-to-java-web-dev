package com.date.command;

import com.date.GeekDatesInfo;
import com.date.ProfileManager;

import javax.servlet.http.HttpServletRequest;

@Command(CommandName =  "join")
public class JoinCommand implements CommandModel {

    @Override
    public String execute(HttpServletRequest request) {
        String age = request.getParameter("age");
        if (age == null || age.isEmpty()) {
            return "index";
        }

        GeekDatesInfo profile = new GeekDatesInfo();
        profile.setName(request.getParameter("name"));

        profile.setAge(Integer.parseInt(age));
        ProfileManager.getInstance().addProfile(profile);

        return "index.html";
    }
}
