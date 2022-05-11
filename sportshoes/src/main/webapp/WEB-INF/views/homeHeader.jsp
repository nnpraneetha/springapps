<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
		<a href="home" style="text-decoration: none; color: black">Sporty Shoes </a>
	</h1>
	<hr style="clear: both;" />
	<div class="topnav">
		<a href="home">Home</a> 
		<a href="menshoes">Men</a> 
		<a href="womenshoes">Women</a> 
		<a class="last" href="signup" style="text-decoration: none">SignUp</a>
		<a class="last" href="signin" style="text-decoration: none">SignIn</a> 	
	</div>
</body>
</html>