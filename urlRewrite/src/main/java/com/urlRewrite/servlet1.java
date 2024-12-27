package com.urlRewrite;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.setContentType("text/html");


        try(PrintWriter out = resp.getWriter()) {

        String name = req.getParameter("name");
        out.println("welcome "+name);
        out.println("<a href='servlet2?user="+name+"'> Go to Second Servlet </a>");
        }

    }
}
