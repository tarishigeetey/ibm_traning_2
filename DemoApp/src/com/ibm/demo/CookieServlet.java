package com.ibm.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

		private String getCurrentUser(String value){
		String username=new String("");
		if(value.equals("100")){
		username=new String("Zubair");
		}
		return username;
		}

		public void doGet(HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
				Cookie[] cookielist = req.getCookies();
				String user = null;
				String responsestring = null;
				if(cookielist != null){
				for(int x=0;x<cookielist.length;x++){
				String name = cookielist[x].getName();
				if(name.equals("Zubair")){
				user = getCurrentUser(cookielist[x].getValue());
				break;
				}
				}
				} 
				if(user == null){
					Cookie cook = new Cookie("Zubair","100");
					cook.setMaxAge(300);
					res.addCookie(cook);
					responsestring = new String("<h2>Welcome to our site, "+
					"we have created a session for you </h2>");
					}
					else{
					responsestring = new String("<h1>Hello:"+ user);
					}
					res.setContentType("text/html");
					PrintWriter out = res.getWriter();
					out.println("<html>");
					out.println("<head><title>CookieServlet</title></head>");
					out.println("<body>");
					out.println(responsestring);
					out.close();
					}
}

