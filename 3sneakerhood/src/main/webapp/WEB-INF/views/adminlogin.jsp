
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<%@include file="homeHeader.jsp"%>

	<center>
		<h1>Admin Login</h1>
	</center>
	<br />
	<form  action="adminLoginAction" method="post">
		<table align="center">
			<tr>
				<td><label>Username : </label></td>
				<td><input type="text" placeholder="Enter Username" name="username" required></td>
			</tr>
			<tr>
				<td><label>Password : </label></td>
				<td><input type="password" placeholder="Enter Password"
					name="password" required></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit">Login</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>