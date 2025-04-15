<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
<body>
	<c:set var="list" value="Aurora,Kygo,Alan"></c:set>
	<c:forTokens items="${list}" delims="," var="friends">
		<p>Welcome, ${friends}</p>
	</c:forTokens>
	
	<c:set target="${userBean}" property="userName" value="Rem"/>
</body>
</html>
