<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert Marks</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container rounded">
		<h2>Insert Marks 😁</h2>
		<sf:form class="form-horizontal" action="CalTotalMarks" method="post" modelAttribute="MarksModel">
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="english">English:</label>
				<div class="col-sm-1">
					<sf:input path="english" type="text" class="form-control" id="english"
						placeholder="Enter Marks" name="english"/>
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="maths">Maths:</label>
				<div class="col-sm-1">
					<sf:input path="maths" type="text" class="form-control" id="maths"
						placeholder="Enter Marks" name="maths"/>
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="science">Science:</label>
				<div class="col-sm-1">
					<sf:input path="science" type="text" class="form-control" id="science"
						placeholder="Enter Marks" name="science"/>
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-1">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</sf:form>
	</div>
</body>
</html>