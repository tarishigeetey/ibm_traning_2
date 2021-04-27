package com.ibm.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		final PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h1> Hello Servlet </h1>");
		out.println("</body></html>");
	}

}
