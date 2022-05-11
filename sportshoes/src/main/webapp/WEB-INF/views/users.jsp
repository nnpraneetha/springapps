<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="resources/css/tablestyle.css"> 
</head>
<body>


	<%@include file="adminlogin.jsp"%>
	<br><br>
	<form align="center" action="userssearch" >
			<input type="text" name="freeText"  placeholder="Enter Username" />
			<input type="submit" value="Search">
		</form>
		<br>
		
	<table>
		<tr>
			<th>User Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Age</th>
			<th>Gender</th>
		</tr>
		<c:forEach items="${users }" var="user">
		<c:if test="${(user.username eq name)  or (empty name)}">
			<tr>
				<td>${user.username }</td>
				<td>${user.email }</td>
				<td>${user.mobile }</td>
				<td>${user.age }</td>
				<td>${user.gender}</td>
				</tr>
		</c:if>
		</c:forEach>
	</table>
</body>
</html>