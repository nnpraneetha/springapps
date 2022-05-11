<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		var p1=document.form.password.value;
		var p2=document.form.confirm.value;
		var dbpass=document.form.dbpass.value;
		var current=document.form.current.value;
		if(dbpass!=current){
			alert('Current Password is invalid');
			return false;
		} if(p1 != p2){
			alert('Confirm Password is not matching with New Password');
			return false;
		}
		else{
			return true;
		}
	}
</script>
</head>
<body>

	<%@include file="adminlogin.jsp"%><br><br>
	
	<form name="form" action="changepasswordindb"  method="post"  onsubmit="return check();">
		<table align="center" >
			<tr>
				<td><input type="hidden" value="${dbpass }" name="dbpass"></td>
				<td><input type="hidden" value="Praneetha" name="username"></td>
			</tr>
			<tr>
				<td>Current Password:</td>
				<td><input type="Password" name="current" required/>
			</tr>
			<tr>
				<td>New Password:</td>
				<td><input type="password" name="password" required/>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="confirm" required />
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Change Password" required/>
			</tr>
		</table>
		<br><br>
		<center><p style="color:blue"><b>${result }</b><p></center><br><br>
	</form>
</body>
</html>