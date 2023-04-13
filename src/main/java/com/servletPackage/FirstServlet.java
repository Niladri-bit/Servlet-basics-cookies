package com.servletPackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FirstServlet implements Servlet{

	ServletConfig conf;

	@Override
	public void destroy() {
		System.out.println("Destroying servlet object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "this server is created for demo";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf = conf;
		System.out.println("Creating servlet object");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("servicing");
		//set content type of response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>output from servlet method</h1>");
		
	}

}
