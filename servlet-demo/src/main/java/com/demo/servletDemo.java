package com.demo;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class servletDemo implements Servlet {

    ServletConfig conf;

    @Override
    public void init(ServletConfig conf) {
        this.conf = conf;
        System.out.println("Creating object");
    }


    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing....");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>this response from service method</h1>");
        out.print("<h1>thday's date and time : " + new Date().toString() + "</h1>");

    }

    public void destroy() {
        System.out.println("going to destroy servlet object");
    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return "";
    }
}
