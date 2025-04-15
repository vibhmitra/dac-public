<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mobile Accessories Shop</title>
<style>
body {
	background-color: #e8d3b0;
	font-family: "Gill Sans", sans-serif;
}

span.error {
	color: red;
}
</style>
</head>
<body style="background-color: rose">
	<a href="/showPage?language=en">English</a> |
	<a href="/showPage?language=de">German</a> |
	<a href="/showPage?language=fr">French</a>
	<h1>
		<center>Welcome to Mobile Accessories Store</center>
	</h1>
	<form:form method="post" action="billDesk" modelAttribute="order">

		<table style="margin: 0px auto; margin-left: auto; margin-right: auto">

			<tr>
				<td><spring:message code="label.customerName" /></td>
				<td><form:input path="customerName" id="customerName" /></td>
				<td><span class="error"><form:errors path="customerName" /></span></td>
			</tr>
			<tr>
				<td><spring:message code="label.contactNumber" /></td>
				<td><form:input path="contactNumber" id="contactNumber" /></td>
				<td><span class="error"><form:errors path="contactNumber" /></span></td>
			</tr>
			<tr>
				<td><spring:message code="label.productName" /></td>
				<td><form:select path="productName" id="productName">
						<form:options items="${productList}" />
					</form:select></td>
			</tr>
			<tr>
				<td><spring:message code="label.quantity" /></td>
				<td><form:input path="quantity" id="quantity" /></td>
				<td><span class="error"><form:errors path="quantity" /></span></td>
			</tr>
			<tr>
				<td>
					<spring:message code="button.submit" var="submitbuttonText" />
					<input type="submit" value="${submitbuttonText}" id="submit" />
				</td>
				<td>
					<spring:message code="button.reset" var="resetbuttonText" />
					<input type="reset" value="${resetbuttonText}" />
				</td>
			</tr>
		</table>
	</form:form>


</body>
</html>
