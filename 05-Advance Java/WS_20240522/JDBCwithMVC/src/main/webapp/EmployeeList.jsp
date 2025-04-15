<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<table border=1 cellpadding="5">
		<thead>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Action</th>
			<tr>
		</thead>
		
		<tbody>
			<c:forEach var="employee" items="${employeeList}">
				<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td>
					<a href="EmployeeController?action=edit&id=${employee.id}">Edit</a>
					<a href="EmployeeController?action=delete&id=${employee.id}">Delete</a>
				</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="EmployeeController?action=new">Add New Employee</a>
</body>
</html>