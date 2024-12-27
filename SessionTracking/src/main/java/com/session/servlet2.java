package com.session;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet2 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // get cookies
        Cookie[] cookies = req.getCookies();

        boolean f = false;
        String name ="";

        if (cookies == null){
            out.println("you are new user please go to home page and register");
            return;
        }else {
            for (Cookie c : cookies){
                String tname = c.getName();

                if (tname.equals("user_name")){
                    f = true;
                    name = c.getValue();
                }
            }
        }
        if (f){
        out.println("Hello "+name+" welcome back to my first servlet");
        }else {
            out.println("you are new user please go to home page and register");
        }
    }
}

