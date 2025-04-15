package com.cdac.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.EmployeeDAO;
import com.cdac.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String URL = "jdbc:mysql://localhost:3306/advancejava";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DRIVER_CLASS);
		System.out.println("Driver Loaded");
		return (DriverManager.getConnection(URL, USER, PASSWORD));
	}

	@Override
	public void addEmployee(Employee employee) {
		String query = "INSERT INTO employee_jdbcmvc (id, firstname, lastname) VALUES (?, ?,?)";

		try {
			Connection con = getConnection();

			PreparedStatement ps = con.prepareStatement(query);
			System.out.println("Connection Established: " + con);

			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getFirstName());
			ps.setString(3, employee.getLastName());

			System.out.println("Executing Query: " + ps);
			int rowsInserted = ps.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("New Employee Inserted Successfully.");
			} else {
				System.out.println("No Employee Has Been Inserted.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Employee getEmployee(int id) {
		String query = "SELECT * FROM employee_jdbcmvc WHERE id = ?";
		Employee employee = null;
		
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return (employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		String query = "SELECT * FROM employee_jdbcmvc";
//		Employee employee = null;
//		List<Employee> employeeList = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
//				employee = new Employee(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"));
//				employeeList.add(employee);
				employeeList.add(new Employee(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname")));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (employeeList);
	}

	@Override
	public void updateEmployee(Employee employee) {
		String query = "UPDATE employee_jdbcmvc SET firstname = ? , lastname = ? WHERE id = ?";
		
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setInt(3, employee.getId());
			
			System.out.println("Query Ran for Prepare Statement" + ps);
			
			ps.executeUpdate();
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		String query = "DELETE FROM employee_jdbcmvc WHERE id = ?";

		try {
			Connection con = getConnection();

			PreparedStatement ps = con.prepareStatement(query);
			System.out.println("Connection Established: " + con);

			ps.setInt(1, id);
			
			System.out.println("Executing Query: " + ps);
			ps.executeUpdate();
			int rowsDeleted = ps.executeUpdate();
			System.out.println(rowsDeleted);
			if (rowsDeleted == 0) {
				System.out.println("Employee Deleted Successfully.");
			} else {
				System.out.println("No Employee Has Been Deleted.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
