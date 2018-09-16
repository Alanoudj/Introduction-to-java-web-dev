package com.date;

import com.date.command.CommandManager;
import com.date.command.CommandModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontControllerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cmd = req.getParameter("CMD");

        CommandModel command = CommandManager.getInstance().getCommand(cmd);

        req.getRequestDispatcher("/" + command.execute(req)).forward(req, resp);
    }
}
