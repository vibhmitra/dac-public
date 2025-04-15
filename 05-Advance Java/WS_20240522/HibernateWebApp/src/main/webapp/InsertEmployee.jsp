<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Insert Employees Form</title>
    
    <style>
 
    	body {
    		max-width: 400px;
    		margin: 0 auto;
    		display: flex-box;
    		box-sizing: border-box;
    		
    	}
    </style>
</head>
<body>
    <section>
        <header>
            <h3><strong>Employee Form</strong></h3>
        </header>
    </section>

    <main>
        <form action="InsertServlet" method="post">
            <div class="form-group">
              <label for="employeeName">Employee Name:</label>
              <input type="text" class="form-control" name="employeeName" id="employeeName">
            </div>
            <div class="form-group">
              <label for="employeeSalary">Salary:</label>
              <input type="text" class="form-control" id="employeeSalary" name="employeeSalary">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
            </form>
    </main>
</body>
</html>