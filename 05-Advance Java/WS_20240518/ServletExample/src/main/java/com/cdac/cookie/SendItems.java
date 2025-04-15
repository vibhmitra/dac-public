package com.cdac.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SendItems() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		pw.print("<html><head><title>Send Items</title></head><body>");
		pw.print("<h2>Send Items:</h2>");
		pw.print("<h4>Welcome! " + userName + "</h4>");
		pw.print("<h4>Location: " + location + "</h4>");
		pw.print("<a href='Inbox' />Go to Inbox</a>");
		pw.print("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
