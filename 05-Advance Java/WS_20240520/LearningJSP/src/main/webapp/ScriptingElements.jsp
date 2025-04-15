<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scripting Element</title>
</head>
<body>

	<%-- Declerative Tag --%>
	<%!int count = 0;

	void incrementCount() {
		count++;
	}%>

	<br>

	<%-- Scriplet Tag --%>
	<%
	int localVar = 0;
	out.print("View Count: " + count);
	incrementCount();
	%>
	<br>

	<%-- Expression Tag --%>
	The Value of Local Var:
	<%=localVar%>
	<%
	localVar++;
	%>

</body>
</html>