package com.cdac.simplelogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegistrationServlet() {
        super();
     
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User usr = new User();
		usr.setUsername(username);
		usr.setPassword(password);
		
		UserDAO uDAO = new UserDAO();
		int i = uDAO.registerUser(usr);
		if (i > 0) {
			response.getWriter().println("</pre><h2>Employee Registered!</h2>");
		} else 
		{
			response.getWriter().println("<h2>Employee Not Registered!</h2>");
		}
		
	}

}
