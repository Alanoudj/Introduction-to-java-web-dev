package com.date.tags;

import com.date.GeekDatesInfo;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

public class MatchedProfilesTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        JspContext jspContext = getJspContext();
        List<GeekDatesInfo> matchedProfiles =  (List<GeekDatesInfo>) jspContext.findAttribute("userProfiles");

        JspWriter out = jspContext.getOut();
        for (GeekDatesInfo profile: matchedProfiles) {
            out.print("<tr>");
            out.print("<td>" + profile.getName() + "</td>");
            out.print("<td>" + profile.getAge() + "</td>");
            out.print("</tr>");
        }
    }
}
