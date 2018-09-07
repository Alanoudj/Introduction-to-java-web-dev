package com.date.command;

import com.date.GeekDatesInfo;
import com.date.ProfileManager;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class RefactorProfileCommand implements CommandModel {

    @Override
    public String execute(HttpServletRequest request) {
        String name = request.getParameter("name");
        if (!name.isEmpty()) {
            int age = Integer.parseInt(request.getParameter("age"));

            List<GeekDatesInfo> profiles = ProfileManager.getInstance().getProfiles(name);

            for (GeekDatesInfo user : profiles) {
                user.setAge(age);
            }
        }

        return "index";
    }
}
