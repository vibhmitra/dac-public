package com.cdac.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String location = request.getParameter("location");
		
		if ("vibh".equals(username) && "root".equals(password)) {
			Cookie cookie1 = new Cookie("user", username);
			Cookie cookie2 = new Cookie("location", location);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.sendRedirect("Inbox");
		}
		else
		{
			response.sendRedirect("unauth.html");
		}
		
	}

}