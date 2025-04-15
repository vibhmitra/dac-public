package com.cdac.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementsEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");

		/*
		 * CREATE DEFINER=`root`@`localhost` PROCEDURE `printEmployeeList`() 
		 * BEGIN
		 * 		SELECT * FROM table_for_callables_ex1; 
		 * END
		 */
	
		String callProcedure = "{call printEmployeeList}";

		CallableStatement cs = con.prepareCall(callProcedure);
		System.out.println(cs);

		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			System.out.println("Employee ID : " + rs.getInt(1));
			System.out.println("Employee First Name : " + rs.getString(2));
			System.out.println("Employee Last Name : " + rs.getString(3));
		}
	}
}
