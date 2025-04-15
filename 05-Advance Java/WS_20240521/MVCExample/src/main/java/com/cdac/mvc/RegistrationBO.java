package com.cdac.mvc;

public class RegistrationBO {
	public boolean registerUser(User user) throws RegistrationBuisnessException, RegistrationException {
		boolean isAgePassed = true;
		if (user.getAge() < 18 || user.getAge() > 60) {
			throw new RegistrationBuisnessException("Invalid Age");
		} else {
			UserDAO userDao = new UserDAO();	// if valid age, then call instance of UserDAO class
			isAgePassed = userDao.insertUser(user);
		}
		return (isAgePassed);
	}
}
