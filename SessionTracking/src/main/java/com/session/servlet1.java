package com.session;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("userInput");
        out.println("Hello "+name+" welcome to my first servlet");
        out.println("<a href='session2'> Go to Servlet2 </a>");

        Cookie c = new Cookie("user_name", name);
        resp.addCookie(c);

    }
}
