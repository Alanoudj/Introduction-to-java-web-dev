package com.date.tags;

import com.date.GeekDatesInfo;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

public class GreetingTag extends SimpleTagSupport {

    private String userName;

    @Override
    public void doTag() throws JspException, IOException {
        JspContext jspContext = getJspContext();
        JspWriter out = jspContext.getOut();

        out.print("<span>Thanks " + getUserName() + " for using Geek Dates™</span>");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
