<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove</title>
</head>
<body>
	<c:catch var="v1">
		<% int x = 10/0; %>
	</c:catch>
	
	<c:if test="${v1 != null}">
		<p>Exception is : ${v1}</p>
		<p>Message: ${v1.message }</p>
	</c:if>
</body>
</html>