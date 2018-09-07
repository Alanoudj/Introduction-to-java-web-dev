package com.date.command;

import javax.servlet.http.HttpServletRequest;

public interface CommandModel {

    public String execute(HttpServletRequest request);
}
