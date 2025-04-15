<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% 
String message = "";
if (request.getAttribute("message") != null) {
	message = request.getAttribute("message").toString();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration JSP</title>
<style>
* {
	font-family: Tahoma;
}

form {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

label {
	font-weight: bold;
}

input[type="text"], input[type="password"], textarea, select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
	font-size: 14px;
	box-sizing: border-box;
}

input[type="radio"] {
	padding: 30px;
	margin: 15px 4px;
	'
}

select {
	appearance: none;
	-webkit-appearance: none;
	-moz-appearance: none;
	background:
		url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24'%3E%3Cpath d='M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6z'/%3E%3C/svg%3E")
		no-repeat right center;
	background-size: 16px;
}

input[type="submit"], input[type="reset"] {
	background-color: #007bff;
	color: #ffffff;
	border: none;
	padding: 10px 20px;
	border-radius: 3px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

</style>
</head>
<body>
	<form action="RegistrationController" method="post">

		<h3>User Registration</h3>
		<span style="color: red"><%=message %></span><br><br>
		<label for="firstname">First Name:</label> <input type="text"
			id="fName" name="fName" required> <label
			for="lastname">Last Name:</label> <input type="text" id="lName"
			name="lName" required> <label for="password">Password:</label>
		<input type="password" id="password" name="password" required>

		<label for="age">Age:</label> <input type="text" id="age" name="age"
			required> <label for="gender">Gender : </label> <label
			for="male">Male:</label> <input type="radio" id="male" name="gender"
			value="male" required> <label for="female">Female:</label> <input
			type="radio" id="female" name="gender" value="female" required><br>
		<label for="country">Country:</label> <select id="country"
			name="country" required>
			<option selected>Selected</option>
			<option value="India">India</option>
			<option value="US">US</option>
		</select> 
		<input type="submit" value="Register">
		<input type="reset" value="Reset">
	</form>
</body>
</html>