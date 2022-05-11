<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="resources/css/tablestyle.css"> 
<style>
table{width:80%;}
</style>
</head>
<body>
	
	<%@include file="userlogin.jsp"%>
	<br><br>
		<center><p style="color:blue"><b>${result }</b></p></center>
	
		<c:if test="${orders.size()==0 }">
			<center><h2>No Orders</h2></center>
		</c:if>
		<c:if test="${!empty orders }">
	<table>
		<tr>
			<th>Order ID</th>
			<th>Product Code</th>
			<th>User Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Price</th>
			<th>Location</th>
			<th>Date</th>
			<th>Category</th>
		</tr>
		<c:forEach items="${orders }" var="order">
		<c:if test="${(order.username eq name)}">
			<tr>
				<td>${order.orderid }</td>
				<td>${order.pcode }</td>
				<td>${order.username }</td>
				<td>${order.email }</td>
				<td>${order.mobile}</td>
				<td>${order.price}</td>
				<td>${order.location}</td>
				<td>${order.date}</td>
				<td>${order.category }</td>
				</tr>
		</c:if>
		
		</c:forEach>
	</table>
	</c:if>
</body>
</html>