package com.cdac.jdbcnormal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDOperations {

	public static Connection con = null;

	// connection to DB
	public Connection createDBConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
	}

	// insertEmployee() Method
	public void insertEmployee() throws SQLException {

		Statement st = con.createStatement();

		String s = "INSERT INTO employee_crud(id, fname, lname) VALUES (21000, 'Vibhanshu', 'M')";

		int i = st.executeUpdate(s);
		if (i > 0) {
			System.out.println("--Employee is Inserted successfully--");
		}
	}

	// updateEmployee() Method
	public void updateEmployee() throws SQLException {

		Statement st = con.createStatement();

		String s = "UPDATE employee_crud SET lname = 'Mitra' WHERE ID = 21000";
		int i = st.executeUpdate(s);
		if (i > 0) {
			System.out.println("--Employee Updated successfully--");
		}
	}

	private void deleteEmployee() throws SQLException {
		Statement st = con.createStatement();
		
		String s = "DELETE FROM employee_crud WHERE id = 21000";
		int i = st.executeUpdate(s);
		if (i > 0) {
			System.out.println("--Employee Deleted successfully--");
		}

	}

	// selectEmployee() Method
	public void selectEmployee() throws SQLException {
		Statement st = con.createStatement();

		String s = "SELECT * FROM employee_crud";
		ResultSet rs = st.executeQuery(s);

		while (rs.next()) {
			System.out.println("Employee ID: " + rs.getInt(1));
			System.out.println("Employee FN: " + rs.getString(2));
			System.out.println("Emplonee LN: " + rs.getString(3));
			System.out.println("---------------------------");
		}
	}

	// Main Calling Function
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		CRUDOperations co = new CRUDOperations();
		con = co.createDBConnection();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Choice > ");
		System.out.println(
				"1. Add Employee \n" + "2. Update Employee\n" + "3. Delete Employee\n" + "4. Show All Employee\n");
		int choice = sc.nextInt();

		do {
			switch (choice) {
			case 1:
				co.insertEmployee();
				break;
			case 2:
				co.updateEmployee();
				break;
			case 3:
				co.deleteEmployee();
				break;
			case 4:
				co.selectEmployee();
				break;
			default:
				System.out.println("Exit!");
				break;
			}
			choice = sc.nextInt();
		} while (choice != 0);
		
		sc.close();
	}
}