<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.List,java.util.ArrayList,com.springapps.springmvc.dto.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello and welcome to Spring MVC</h1>
	
	
	<%
		List<Employee> emps= (List<Employee>) request.getAttribute("employee");
		for(Employee emp:emps){
			out.println(emp);
			out.println("<br>");
		}
	%>
	
</body>
</html>