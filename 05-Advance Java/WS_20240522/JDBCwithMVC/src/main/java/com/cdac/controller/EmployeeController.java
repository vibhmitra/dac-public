package com.cdac.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.model.Employee;
import com.cdac.dao.EmployeeDAO;
import com.cdac.dao.impl.EmployeeDAOImpl;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// init and deceleration i guess
	private EmployeeDAO employeeDAO;
	
	public void init() {
		employeeDAO = new EmployeeDAOImpl();
	}

    public EmployeeController() {
        super();
  
    }

    // get method
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action == null)
			action = "list";
		
		if ("new".equals(action)) {
			showNewForm(request, response);
		} else if ("edit".equals(action)) {
			showEditForm(request, response);
		} else if ("delete".equals(action)) {
			deleteEmployee(request, response);
		}	else {
			listEmployees(request, response);
		}
	}
	
	

	// post method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		int id = 0;
		if (idString != null && !idString.isEmpty()) {
			id = Integer.parseInt(idString);
		}
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		Employee employee = new Employee(id, firstName, lastName);
		
		if (id == 0) {
			employeeDAO.addEmployee(employee);
		} else {
			employeeDAO.updateEmployee(employee);
		}
		response.sendRedirect("EmployeeController?action=list");
	}
	
	
	// list all employee
	private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> employeeList = employeeDAO.getAllEmployees();
		request.setAttribute("employeeList", employeeList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeList.jsp");
		dispatcher.forward(request, response);
	}

	// edit
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		if (idString != null && !idString.isEmpty()) {
			int id = Integer.parseInt(idString);
			Employee existingEmployee = employeeDAO.getEmployee(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeForm.jsp");
			request.setAttribute("employee", existingEmployee);
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("EmployeeController?action=list");
		}
	}

	// Show when add new employee
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeForm.jsp");
		dispatcher.forward(request, response);	
	}
	
	// delete employee
	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String idString = request.getParameter("id");
		System.out.println(idString);
		if (idString != null && !idString.isEmpty()) {
			int id = Integer.parseInt(idString);
			employeeDAO.deleteEmployee(id);
		}
		response.sendRedirect("EmployeeController?action=list");
	}
}


