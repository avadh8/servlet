package com.practice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.setContentType("text/http");
        PrintWriter out = resp.getWriter();
        out.println("<h1> Welcome to Register Servlet </h1>");

        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition = req.getParameter("user_condition");

        out.println(condition);

if (condition != null) {
    if (condition.equals("on")) {
        out.println("<h1>Welcome to Register Servlet</h1>");
        out.println("<h2>Name: </h2>" + name);
        out.println("<h2>Password: </h2>" + password);
        out.println("<h2>Email: </h2>" + email);
        out.println("<h2>Gender: </h2>" + gender);
        out.println("<h2>Course: </h2>" + course);

        RequestDispatcher rd = req.getRequestDispatcher("success");
        rd.forward(req,resp);

    } else {
        out.println("check condition first");
    }
}else {
    out.println("check condition first");

    RequestDispatcher rd = req.getRequestDispatcher("index.html");
    rd.include(req, resp);


}
    }
}
