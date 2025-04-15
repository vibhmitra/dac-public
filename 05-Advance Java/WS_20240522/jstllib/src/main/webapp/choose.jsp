<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Choose</title>
</head>
<body>

 <c:set var="number" value="8"/>
 <c:choose>
 	<c:when test="${number eq 3 }"><p>Num is 3</p></c:when>
 	<c:when test="${number eq 8 }"><p>Num is 8</p></c:when>
 	<c:otherwise><p>Num is neither 3 or 8</p></c:otherwise>
 </c:choose>
</body>
</html>