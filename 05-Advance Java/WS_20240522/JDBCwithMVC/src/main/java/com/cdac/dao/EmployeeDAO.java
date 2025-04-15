package com.cdac.dao;

import java.util.List;

import com.cdac.model.Employee;

public interface EmployeeDAO {
	void addEmployee(Employee employee);
	Employee getEmployee(int id);
	List<Employee> getAllEmployees();
	void updateEmployee(Employee employee);
	void deleteEmployee(int id);
}