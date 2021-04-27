package com.ibm.demo;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//when returning obj of an obj we can type cast
		int k =0;
//      Cookie Acceptance
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
	
		k*= k;
//	     Session Management 
//			HttpSession session = req.getSession();
//			session.removeAttribute("k");  --- to remove session
//			int k = (int)session.getAttribute("k");
//   		k*= k;

			
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k * k;
//		ink k = (int)req.getAttribute("k");
    	res.getWriter().println(k);
	}
}
