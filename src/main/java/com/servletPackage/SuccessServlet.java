package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SuccessServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Successfully registered </h1>");
	}
}
