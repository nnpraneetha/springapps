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
	table{
		width:90%;
	}
</style>
</head>
<body>
	<%@include file="adminlogin.jsp"%>
	<br><br>
	<form align="center" action="orderssearch" >
			Date:<input type="date" name="date"  placeholder="Enter Date" required />
			Category:
			<select name="category"  required>
			<option value="" disabled selected>Select option</option>
				<option value="men">men</option>
				<option value="women">women</option>
			</select>
			<input type="submit" value="Search">
		</form>
		<br>
		
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
		<c:if test="${((order.date eq date) and (order.category eq category)) or ((empty date) and (empty category))}">
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
</body>
</html>