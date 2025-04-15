package com.cdac.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementsEx2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
		
		int employeeId = 0;
		
		String sql = "{? = CALL getEmployeeFullName(?)}";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Employee ID: ");
			employeeId = sc.nextInt();
		}
		
		CallableStatement cs = con.prepareCall(sql);
		
		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, employeeId);
		cs.execute();
		
		String fullName = cs.getString(1);
		System.out.println("Employee Full Name: " + fullName);
	}
}
