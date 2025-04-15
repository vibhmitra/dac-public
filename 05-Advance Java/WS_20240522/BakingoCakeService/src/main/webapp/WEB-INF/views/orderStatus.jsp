<%@page import="java.util.Date"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Status</title>
<style>
	body { align-content: center;
			margin: 0 auto;
			max-width: 400px;
	}
	
</style>
</head>
<body>
	<h2 id="status">
		Your order has been successfully placed, <br/>
		Order Id is: ${orderId} <br/>
		Order Date: ${orderDate} <br/>
		Amount in dollar: $${cake.getPrice()} <br/>
		Amount in Rupees: Rs.${indianPrice} <br/>
	</h2>
	<button onclick="window.location.href='/OrderForm';" class="GFG">Order More?</button>
</body>
</html>
