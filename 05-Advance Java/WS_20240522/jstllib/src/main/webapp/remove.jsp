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
	<c:set var="v1" value="Welcome!"></c:set>
		<p>BEFORE REMOVAL: ${v1}</p>
	<c:remove var="v1"/>
		<p>AFTER REMOVAL: ${v1}</p>
</body>
</html>