<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function setdate(){
		var date = new Date();
		var day = date.getDate();
		var month = date.getMonth() + 1;
		var year = date.getFullYear();
		if (month < 10) month = "0" + month;
		if (day < 10) day = "0" + day;
		var today = year + "-" + month + "-" + day;
		document.getElementById('date').value = today;
}

</script>
<style>

.button {
    display: block;
    width: 115px;
    height: 40px;
    background: #4E9CAF;
    padding: 5px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
     
}
</style>
</head>
<body onload="setdate();">

	<%@include file="userlogin.jsp"%>
	<br>

	<c:set var="total" value="${0}" />
	<c:forEach items="${cart }" var="cart" varStatus="status" step="1" begin="0">
		<c:set var="total" value="${ total + cart.price }" />
	
	</c:forEach>

	
	<form action="ordersuccess" method="post">

		<table align="center">
			<tr>
				<td colspan="2"><h2>Payee Details:</h2></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="username"  /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobile" /></td>
			</tr>

			<tr>
				<td>Location:</td>
				<td><input type="text" name="location" /></td>
			</tr>
			<tr>
				<td>Pin Code:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Date:</td>
				<td><input id="date" type="date"  name="date" readonly></td>
				
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" value="${total}" name="price" readonly /></td>
			</tr>
			
			
			
			
			<tr>
				<td colspan="2"><h2>Card Details:</h2></td>
			</tr>
			<tr>
				<td>Card Number:</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Expire Date:</td>
				<td><input type="date"></td>
			</tr>
			<tr>
				<td>CVV:</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td></td>
				<td><input class="button" type="submit" value="Proceed to Pay"></td>
			</tr>
		</table>
	</form>


</body>
</html>