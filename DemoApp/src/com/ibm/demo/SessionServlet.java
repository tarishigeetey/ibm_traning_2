package com.ibm.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	// Get the session object
	final HttpSession session = req.getSession(true);
	resp.setContentType("text/html");
	final PrintWriter out = resp.getWriter();
	
	out.println("<html><body>");
	out.println("<h1>Session Counter:</h1>");
	Integer ival = (Integer) session.getAttribute("sessiontest.counter");
	if(null == ival) {
	ival = new Integer(1);
	} else {
	ival = new Integer(ival.intValue() + 1);
	}
	session.setAttribute("sessiontest.counter", ival);
	out.println("You have hit this page <b>" + ival + "</b> times.<p>");
	out.println("<p>");
	
	out.println("<h3>Session Data:</h3>");
	out.println("New Session: " + session.isNew());
	out.println("<br>Session ID: " + session.getId());
	out.println("<br>Creation Time: " + session.getCreationTime());
	out.println("<br>Last Accessed Time: " +
	session.getLastAccessedTime());
	out.println("</body></html>"); 
	}
}
