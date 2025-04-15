package com.cdac.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			User user = new User();
			user.setFirstName(request.getParameter("fName"));
			user.setLastName(request.getParameter("lName"));
			user.setPassword(request.getParameter("password"));
			user.setCountryName(request.getParameter("country"));
			user.setGender(request.getParameter("gender"));
			
			try {
				user.setAge(Integer.parseInt(request.getParameter("age")));
			}
			catch (NumberFormatException e) {
				throw new RegistrationBuisnessException("Age Should Be a Number!");
			}
			RegistrationBO registerBo = new RegistrationBO();
			if (registerBo.registerUser(user)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
				dispatcher.forward(request, response);
			}
		} catch (RegistrationBuisnessException e) {
			request.setAttribute("message", e.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("Registration.jsp");
			dispatcher.forward(request, response); 
		} catch (RegistrationException e) {
			e.printStackTrace();
			request.setAttribute("errMessage", "Fatal Error");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
			dispatcher.forward(request, response); 
		}
	}

}
