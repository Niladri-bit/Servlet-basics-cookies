package com.servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newRegister
 */
@WebServlet("/newRegister")
public class newRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectiondb","root","Niladri@11.01.2000");
		String q="insert into connectiondb.user(name,password,email) values(?,?,?)";
		 PreparedStatement pstmt= con.prepareStatement(q);
		 pstmt.setString(1, name);
		 pstmt.setString(2, password);
		 pstmt.setString(3, email);
		 
		 pstmt.executeUpdate();
		 out.println("<h1>done</h1>");
		}
		catch(Exception e) {
			e.printStackTrace();
			out.println("<h1>Done</h1>");
		}
		out.println("<h2>" + name +"</h2>");
	}

}
