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

	<%@include file="adminlogin.jsp"%>

	<c:forEach items="${products }" var="pro" varStatus="status" step="1" begin="0">
	<c:if test="${pro.category=='men' }">
		<div class="col${status.index % 3 + 1}">
			
				<img src="<c:url value="${pro.image }"/>" style="width: 50%; height: 40%; border: 1px" /> <br>
							${pro.company }<br> ${pro.name }<br> ${pro.price }<br>
				
		<!--  	<a class="button" href="addToCart/${pro.code}/${pro.name}">Add to Cart</a>  -->
				<form action="adminDeleteProduct" method="post">
					
					<input type="hidden" id="code" name="code" value="${pro.code} ">
					<input class="button" type="submit" value="Delete" />
				
				</form>
			 
		</div>
		</c:if>
		</c:forEach>
</body>
</html>