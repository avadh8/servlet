package com.practice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class httpServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> this method is frome http servlet</h1>");
        out.println("<h3> current time and date"+new Date().toString()+"</h3>");
    }

}
