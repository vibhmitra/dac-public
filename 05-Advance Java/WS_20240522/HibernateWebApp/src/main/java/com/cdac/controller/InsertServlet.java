package com.cdac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.logic.Employee;
import com.cdac.logic.EmployeeDAO;


public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Employee employee = new Employee();
			employee.setEmployeeName(request.getParameter("employeeName"));
			employee.setEmployeeSalary(Double.parseDouble(request.getParameter("employeeSalary")));
			EmployeeDAO employeeDao = new EmployeeDAO();
			employeeDao.insertProduct(employee);
			response.sendRedirect("Success.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("Error.jsp");
		}
	}

}
