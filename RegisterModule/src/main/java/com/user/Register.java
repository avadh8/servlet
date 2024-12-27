package com.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Register extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

//        out.println(name);
//        out.println(email);
//        out.println(password);

        try {
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");

                String q = "insert into user(name,email,password) values(?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,password);

            pstmt.executeUpdate();
            out.println("done");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("error");
        }

    }
}
