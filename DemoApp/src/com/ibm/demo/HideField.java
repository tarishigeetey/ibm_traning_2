package com.ibm.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenFieldServlet")
public class HideField extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher rd=null;
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>HiddenFeildSer</title></head>");
			out.println("<body>");
			
			out.println("<FORM ACTION=\"http://localhost:8081/examples/servlet/HiddenFeild\" METHOD=POST>");
					out.println("<INPUT TYPE = hidden NAME = user VALUE = James>");
					out.println("<INPUT TYPE = hidden NAME = session VALUE =12892>");
					out.println("<INPUT TYPE = submit value=\"Finished Shopping\">");
					out.println("</FORM>");
					out.println("</body></html>");
					out.close();
}
	public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException
			{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>HiddenFieldServlet</title></head>");
			out.println("<body>");
			// Get the hidden inputs and echo them
			String user = request.getParameter("user");
			String session = request.getParameter("session");
			out.println("<H2>Hello "+ user +" your session id is "+ session +"</h2>");
			out.println("</form></body></html>");
			out.close();
			}
}
