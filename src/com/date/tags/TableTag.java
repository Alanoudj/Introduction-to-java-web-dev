package com.date.tags;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;
import java.io.IOException;

public class TableTag extends BodyTagSupport {

    @Override
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().print("<table>");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Tag.EVAL_BODY_INCLUDE;
    }


    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().print("</table>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Tag.SKIP_BODY;
    }
}
