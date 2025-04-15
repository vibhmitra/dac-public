package com.cdac.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int count = 0;

    public LifeCycle() {
        super();
        
    }
    
    public void init(ServletConfig config) {
    	System.out.println("Servlet Init : " + count);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		count++;
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Servlet Called: " + count + " Times </h1>");
			
	}

}
