<%@page isELIgnored="false"%>
<html>
<head>
<title>Bill | Mobile Accessories Shop</title>
<style>
body {
	background-color: #e8d3b0;
	font-family: "Gill Sans", sans-serif;
}

.center {
	padding: 10px 20;
	text-align: center;
	margin: 70px auto; 
	width: fit-content;
	border: 1px dotted black;
	border-radius: 20px;
}

span.price {
	font-weight: 600;
}

div>p {
	font-size: 2rem;
}

</style>
</head>
<body>
	<div class="center">
		<p>Hi <u>${name}</u>! You need to pay <span class="price"> &#x20B9; ${cost}</span></p>
		
		<table>
			<tbody>
				<tr>
					<td>Product Name</td>
					<td><b>: ${productName}</b></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><b>: ${quantity}</b></td>
				</tr>
				<tr>
					<td colspan=2>
						<a href="#">Pay Now</a>
					</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>