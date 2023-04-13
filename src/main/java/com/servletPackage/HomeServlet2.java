package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet2 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//getting cookies
		Cookie[] cookies = req.getCookies();
		boolean f = false;
		String name = "";
		
		if(cookies == null) {
			out.println("<h1>new user</h1>");
			return;
		}
		else {
			for(Cookie c :cookies) {
				String tname = c.getName();
				if(tname.equals("user_name")) {
					f = true;
					name= c.getValue();
				}
			}
		}
		if(f) {
		out.println("<h1>Hello, "+ name +" welcome to home servlet2 </h1>");
		}
		else {
			out.println("<h1>new user</h1>");
		}
	}
}
