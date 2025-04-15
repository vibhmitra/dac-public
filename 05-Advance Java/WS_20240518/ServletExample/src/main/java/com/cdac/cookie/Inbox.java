package com.cdac.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Inbox() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		
		String userName = null;
		String location = null;
		
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("user")) {
				userName = cookie.getValue();
			} else if (cookie.getName().equals("location")) {
				location = cookie.getValue();
			}
		}
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><title>Inbox</title></head><body>");
		pw.print("<h2>Inbox:</h2>");
		pw.print("<h4>Welcome!, " + userName + "</h4>");
		pw.print("<h4>Location: " + location + "</h4>");
		pw.print("<a href='SendItems' />Send Items</a>");
		pw.print("</body></html>");
	}


}
