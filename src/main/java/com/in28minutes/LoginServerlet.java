package com.in28minutes;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServerlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Servlet
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Dummy stuff</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("9/11 was a lie");
		out.println("</body>");
		out.println("</html>");
		*/
		//path start from web-inf
		String name = request.getParameter("name");
		System.out.println("name parameter=" + name);
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
		
	}
}
