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

	<%@include file="homeHeader.jsp"%>
	<table>

		<tr>
			<c:forEach items="${products }" var="pro">
				<c:if test="${pro.category=='men' }">
					<td><img src="<c:url value="${pro.image }"/>"
						style="width: 50%; height: 40%; border: 1px" /> <br>
						${pro.company }<br> ${pro.name }<br> ${pro.price }</td>

				</c:if>
			</c:forEach>
		</tr>
	</table>
</body>
</html>