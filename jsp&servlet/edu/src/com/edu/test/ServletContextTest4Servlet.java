package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		ServletContext sc = this.getServletContext();

		ShareObject obj1 = (ShareObject) sc.getAttribute("data1");
		ShareObject obj2 = (ShareObject) sc.getAttribute("data2");
		
		out.print("DATA 1 : " + obj1.getCount() + " , " + obj1.getStr() + "<br>");
		out.print("DATA 2 : " + obj2.getCount() + " , " + obj2.getStr() + "<br>");
		
		out.close();
	}
}
