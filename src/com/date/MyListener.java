package com.date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
//        servletContextEvent.getServletContext().setAttribute("");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
