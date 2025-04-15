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
	<c:url value="choose.jsp" var="url">
		<c:param name="username" value="Vibhanshu"/> 
	</c:url>
	<a href="${url}">ChooseJSP</a>
	

</body>
</html>