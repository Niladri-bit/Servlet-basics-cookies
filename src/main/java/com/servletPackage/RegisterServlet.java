package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>welcome to register Servlet </h1>");
		
		String name = req.getParameter("user");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		if(cond!=null) {
		if(cond.equals("checked")) {
			out.println("<h1>welcome: " + name + " </h1>");
			out.println("<h1>welcome: " + password + " </h1>");
			out.println("<h1>welcome: " + email + " </h1>");
			out.println("<h1>welcome: " + gender + " </h1>");
			out.println("<h1>welcome: " + course + " </h1>");
			
			//successfully registered
			RequestDispatcher rd = req.getRequestDispatcher("Success");
			rd.forward(req, resp);
		}
		else {
			out.println("<h1>You have not checked terms and conditions </h1>");
			
		}
		}
		else {
			out.println("<h1>You have not checked terms and conditions </h1>");
			//using RequestDispatcher
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}

}
