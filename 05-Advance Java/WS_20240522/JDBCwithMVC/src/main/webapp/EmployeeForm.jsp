<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
	<h1>Employee Form</h1>

	<form method="post" action="EmployeeController">
		<input type="hidden" name="id" id="id" value="${employee.id}"/>
		<label for="firstName">First Name</label> <input type="text" id="firstName" name="firstName" value="${employee.firstName}"><br>
		<label for="lasttName">Last Name</label> <input type="text" id="lastName" name="lastName" value="${employee.lastName}"><br>
		<input type="Submit" value="Save"/>
	</form>
	
	<a href="EmployeeController?action=list">Back To Employee List</a>
</body>
</html>