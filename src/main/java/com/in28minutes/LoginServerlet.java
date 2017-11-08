package com.in28minutes;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServerlet extends HttpServlet{
	
	private UserValidationService service = new UserValidationService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		String name = request.getParameter("inputName");
		String password = request.getParameter("inputPassword");
		boolean isUserValid = service.isUserValid(name, password);
		
		if(isUserValid){
			request.setAttribute("name", name);
			request.setAttribute("password", password);			
			request.getRequestDispatcher("/WEB-INF/views/form.jsp").forward(request, response);
		}else{
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
		}
		
		
	}
	
	
}
