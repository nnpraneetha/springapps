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
	<br>
	<center><p style="color:blue"><b>${result }</b></p></center>
	
	<form action="signupredirect" method="post">
		<center><h2>Enter your Details</h2></center>
		
		<table align="center">
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" required></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" required></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobile" required></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age" required></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="text" name="gender" required></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required></td>
			<tr>
				<td></td>
				<td><input type="submit" value="Signup"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>