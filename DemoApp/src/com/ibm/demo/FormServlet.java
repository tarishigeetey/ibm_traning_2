package com.ibm.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req, res);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		final PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Form Parameters</h1>");
		out.println("<table>");
		out.println("<tr><th> Name </th><th> Value </th> </tr>");
		
		final Enumeration names = req.getParameterNames();
		while(names.hasMoreElements()) {
			final String name =  (String) names.nextElement();
			final String value = req.getParameter(name);
			out.println("<tr><th> " + name  + " </th><th> " + value + " </th> </tr>");
		    
		}
		out.println("</table>");
		out.println("</body></html>");
		
		
	}
}
