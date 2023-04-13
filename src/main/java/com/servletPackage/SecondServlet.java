package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet using generic servlet");
		//set content type of response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>output from second servlet method using generic servlet</h1>");
		
	}
	
}
