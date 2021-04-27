package com.ibm.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private int counter = 0;
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1>Hello Servlet</h1>");
		counter ++;
		out.println("<h3>Visiteor no : " + counter + "</h3>");
		Date now = new Date();
		out.println("<h3>Log : " + now + "</h3>");
	}

	
}
