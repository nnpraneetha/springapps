<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
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

.topnav a,button[type=submit] {
	float: left;
	background-color: #333;
	color: #f2f2f2;
	text-align: center;
	padding: 20px 16px;
	text-decoration: none;
	font-size: 19px;
}

.topnav a:hover,button[type=submit]:hover  {
	background-color: #ddd;
	color: black;
}

.topnav a.last,button[type=submit].last {
	float: right;
}

</style>
</head>
<body>
	
	
	<h1 style="text-align: right; float: right;">
		${name }
	</h1>
	
	<h1 style="text-align: left; float: left;">
		<a href="home" style="text-decoration: none; color: black">Sporty Shoes </a>
	</h1>
	
	<hr style="clear: both;" />

	<div class="topnav">
		<a href="userlogin">Home</a> 
		<a href="menshoes">Men</a> 
		<a href="womenshoes">Women</a> 
		
		<a class="last" href="home" style="text-decoration: none">Sign out</a>
	 <!-- <a class="last" href="userorders" style="text-decoration: none ">Orders</a>  -->
	 	<form action="userorders">
	 		<input type="hidden" name="username" value="${ name}" />
	 		<button class="last" type="submit" value="Orders">Orders</button>
	 	</form>
		<a class="last" href="cart" style="text-decoration: none">Cart</a> 
		
			
	</div>
<!-- 	<img src="<c:url value="/resources/images/men/menmain1.jpg"/>" style="float: left" />
	<img src="<c:url value="/resources/images/women/main9.jpg"/>" style="float: left">   -->

</body>
</html>