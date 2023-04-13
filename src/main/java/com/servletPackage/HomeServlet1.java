package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		out.println("<h1>Hello, "+ name +" welcome to home servlet1 </h1>");
		out.println("<h1><a href='HomeServlet2'>Go to servlet 2</a></h1>");
	
		//create a cookie
		Cookie c = new Cookie("user_name",name);
		resp.addCookie(c);
	}
}
