<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	margin: 10;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	background-color: #333;
	color: #f2f2f2;
	text-align: center;
	padding: 20px 16px;
	text-decoration: none;
	font-size: 19px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.last {
	float: right;
}
</style>
</head>
<body>
	
	<h1 style="text-align: left; float: left;">
		<a href="adminHome" style="text-decoration: none; color: black">Sporty Shoes </a>
	</h1>
	<h3 style="text-align: right; float: right;">

		

	</h3>
	<hr style="clear: both;" />

	<div class="topnav">
		<a href="adminHome">Home</a> 
		<a href="menshoes">Men</a> 
		<a href="womenshoes">Women</a>
		 <a href="kidshoes">Kids</a>
		 <a class="last" href="admin" style="text-decoration: none">Signout</a>
		 <a class="last" href="changePassword" style="text-decoration: none">Change Password</a>
 	 <a class="last" href="users" style="text-decoration: none">Users</a>
	 	 <a class="last" href="orders" style="text-decoration: none ">Orders</a> 
		<a class="last" href="products" style="text-decoration: none">Products</a> 
		 
		

	</div>


</body>
</html>