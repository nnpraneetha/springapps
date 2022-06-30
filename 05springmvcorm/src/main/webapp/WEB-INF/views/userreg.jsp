<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"
	import="java.util.List,com.springapps.springmvcorm.entity.User" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

	<h1>User Registration</h1>
	<form action="registeruser" method="post">

		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>


	<p>${result }</p>
	<ul>
		<c:forEach items="${users }" var="user">
		<c:if test="${user.id==1 }">
			<li>${user.id } |${user.name }| ${user.email }</li>
		</c:if>
		</c:forEach>
	</ul>
</body>
</html>