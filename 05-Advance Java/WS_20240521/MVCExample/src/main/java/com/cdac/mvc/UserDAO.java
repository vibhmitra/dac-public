package com.cdac.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
	
	// creating connection with DATABASE
	private Connection createConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava", "root", "root");
		} 
		catch (Exception e) {
			throw new SQLException("Error creating connection", e);
		}
	}
	
	// Method to Insert User
	public boolean insertUser(User user) throws RegistrationException {
		boolean flag = false;
		try {
			Connection con = createConnection();
			String queryString = "INSERT INTO users(firstname, lastname, password, age, country, gender) " +
			 "VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(queryString);
			ps.setString(1,  user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3,  user.getPassword());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getCountryName());
			ps.setString(6,  user.getGender());
			
			if(ps.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			throw new RegistrationException(e);
		}
		return (flag);
	}
}
