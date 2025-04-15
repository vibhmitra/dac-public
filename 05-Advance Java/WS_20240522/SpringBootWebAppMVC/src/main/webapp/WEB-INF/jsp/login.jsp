<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>

<body bgcolor="skyblue">
		<h1>ZEE-ZEE Web Portal</h1>
		<sf:form action="/submitlogin" method="post" modelAttribute="login">
		<table border="2">
			<tr>
				<td>UserName:</td>
				<td><sf:input path="userName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><sf:password path="userPassword" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" name="submit" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>
	</sf:form>
</body>

</html>