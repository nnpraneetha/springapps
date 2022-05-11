<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.col1 {
    position: absolute;
    left: 10px;
    padding: 10px;  
}

.col2 {
    position: absolute;
    margin-left: 400px;
    padding: 10px;
}

.col3 {
    margin-left:800px;
    padding: 10px;
}
.button {
    display: block;
    width: 115px;
    height: 40px;
     margin-left: 90px;
    background: #4E9CAF;
    padding: 5px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
}
.button-corner {
display: block;
    width: 115px;
    height: 30px;
      background: #4E9CAF;
    padding: 5px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
  position: fixed;
  bottom: 20px;
  right: 20px;
}

</style>
</head>
<body>

		<%@include file="userlogin.jsp"%>
		<br>
		
		<c:if test="${cart.size()==0 }">
			<center><h2>Cart is Empty</h2></center>
		</c:if>
		<c:if test="${!empty cart }">
		<h2>Items in Cart</h2>
		<br>
		<c:forEach items="${cart }" var="cart" varStatus="status" step="1" begin="0">
		<div class="col${status.index % 3 + 1}">
			
				<img src="<c:url value="${cart.image }"/>" style="width: 50%; height: 40%; border: 1px" /> <br>
							${cart.company }<br> ${cart.name }<br> ${cart.price }<br>
							
		 	<form action="deleteitem" method="post">
		 	
				<input type="hidden" id="cartid" name="cartid" value="${cart.cartid}">	
					<input class="button" type="submit" value="Delete" />
				</form>
				
			
		</div>
		</c:forEach>
	<!-- 		<div class="button-corner">
				<form action="buy" method="post">
						
				</form>		
			</div>
			-->
		<br> <a class="button-corner" href="buy" style="text-decoration:none">Buy</a> 
	
		</c:if>
</body>
</html>