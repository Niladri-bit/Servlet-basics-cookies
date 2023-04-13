package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

public class HttpServletPractice extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("this is get method");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>this is get method</h1>");
		
	}
}
