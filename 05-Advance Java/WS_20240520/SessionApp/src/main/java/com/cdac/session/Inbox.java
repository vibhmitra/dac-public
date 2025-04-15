package com.cdac.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Inbox() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.html");
			return;
		}
		
		String userName = session.getAttribute("username").toString();
		String location = session.getAttribute("location").toString();
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.print("<html><head><title>Inbox</title>");
		pw.print("<link rel='stylesheet' type='text/css' href='/SessionApp/UserStyle.css'>");
		pw.print("</head><body>");
		pw.print("<h2>Inbox:</h2>");
		pw.print("<h3>Welcome, " + userName + "</h3>");
		pw.print("<h4>Location: " + location + "</h4>");
		pw.print("<a href='SendItems' />Send Items</a><br>");
		pw.print("<a href='Logout' />Logout</a>");
		pw.print("</body></html>");
		
	}
}
