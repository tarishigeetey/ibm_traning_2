package com.ibm.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	// service, doGet, doPost, Req dispatcher 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k =i+j;

//     Cookie
	   Cookie cookie = new Cookie("k", k +"");
	   res.addCookie(cookie);
	   res.sendRedirect("sq");
	   
//      Session sendRedirect
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");

//      Its interface--ReqestDispatcher 
		
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
//		SendRedirect	
//		res.sendRedirect("sq?k=" + k); // URL Rewriting
	}
}
