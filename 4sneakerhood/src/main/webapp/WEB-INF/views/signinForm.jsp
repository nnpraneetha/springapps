<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="Error.jsp" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
<body>
	<%@include file="homeHeader.jsp"%>

	<form action="adminLoginAction" method="post">
		<center><h2>Enter your Credentials</h2></center>

		<table align="center">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			<tr>
				<td></td>
				<td><input type="submit" value="Signin"></td>
			</tr>
		</table>
	</form>

</body>
</html>