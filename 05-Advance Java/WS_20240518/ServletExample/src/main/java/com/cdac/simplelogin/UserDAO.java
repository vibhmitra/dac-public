package com.cdac.simplelogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

//DAO


public class UserDAO {

	// JDBC Driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/employees";
	
	// Database Credentials 
	static final String USER = "root";
	static final String PASS = "root";
	
	// Insert Method
	public int registerUser(User user) {
		int rowAffected = 0;
		Connection connection = null;
		PreparedStatement  preparedStatement = null;
		
		try {
			// Load The JDBC Driver
			Class.forName(JDBC_DRIVER);
			
			// Establishing the Connection from DB
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println(connection);
			
			String query = "INSERT INTO users (username, password ) VALUES (?, ?)";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			
			rowAffected = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return (rowAffected);
	}
	
}
