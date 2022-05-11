<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>
.col1 {
        margin-left:800px;
    padding: 10px;  
}

.col2 {
     position: absolute;
    left: 10px;
    padding: 10px; 
}

.col3 {
 	
        position: absolute;
    margin-left: 400px;
    padding: 10px;
}
.button {
    display: block;
    width: 115px;
    height: 40px;
     margin-left: 175px;
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
<body align="center">

	<%@include file="userlogin.jsp"%>

	<c:forEach items="${products }" var="pro" varStatus="status" step="1" begin="0">
		<div class="col${status.index % 3 + 1}">
			<c:if test="${pro.category=='women' }">
				<img src="<c:url value="${pro.image }"/>" style="width: 50%; height: 40%; border: 1px" /> <br>
							${pro.company }<br> ${pro.name }<br> ${pro.price }<br>
				<form action="addToCart" method="post">
					
					<input type="hidden" id="code" name="code" value="${pro.code} ">
					<input type="hidden" id="name" name="name" value="${pro.name} ">
					<input type="hidden" id="company" name="company" value="${pro.company} ">
					<input type="hidden" id="price" name="price" value="${pro.price} ">
					<input type="hidden" id="category" name="category" value="${pro.category} ">
					<input type="hidden" id="image" name="image" value="${pro.image} ">
					<input class="button" type="submit" value="Add to cart" />
				
				</form>
			 </c:if>
		</div>
		</c:forEach>
</body>
</html>