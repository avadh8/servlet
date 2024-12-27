package com.attributeServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;

public class S1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String n1 = req.getParameter("n1");
        String n2 = req.getParameter("n2");

        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        int s = nn1 + nn2;

        req.setAttribute("sum",s);

        RequestDispatcher rd = req.getRequestDispatcher("s2");
        rd.forward(req,resp);
    }
}

