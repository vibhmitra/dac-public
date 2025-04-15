package com.cdac.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String location = request.getParameter("location");
		
		if ("vibh".equals(username) && "root".equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("location", location);
			response.sendRedirect("Inbox");
		} 
		else {
			response.sendRedirect("login.html");
		}
	}
}
