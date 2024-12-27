package com.attributeServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S2 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

//        int nn1 = Integer.parseInt(req.getParameter("n1"));
//        int nn2 = Integer.parseInt(req.getParameter("n2"));

        String n1 = req.getParameter("n1");
        String n2 = req.getParameter("n2");

        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        int p = nn2 * nn2;

        int sum = (int)req.getAttribute("sum");
        out.println("sum : "+ sum);
        out.println("production : "+ p);

    }
}
