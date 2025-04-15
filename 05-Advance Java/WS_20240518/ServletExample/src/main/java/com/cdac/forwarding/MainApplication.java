package com.cdac.forwarding;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MainApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainApplication() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("Servlet1");
			request.setAttribute("n1", "String 1");
			response.getWriter().println("<p>Welcome Main n1</p>");
			dispatcher1.include(request, response);
			
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("Servlet2");
			request.setAttribute("n2", "String 2");
			response.getWriter().println("<p>Welcome Main n2</p>");
			dispatcher2.include(request, response);	
			
			/*
			 * The Redirect Method will send the data and give the control/redirects to
			 * Servlet1 This also changes the url. response.sendRedirect("Servlet1");
			 */
	}
}
