<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>



	<ul>
		<c:forEach items="${products }" var="pro">
			<c:if test="${pro.category==men }">
				<li>${pro.code }|${pro.name }| ${pro.company }|${pro.price }|${pro.image}
				</li>
			</c:if>
		</c:forEach>
	</ul>
</body>
</html>