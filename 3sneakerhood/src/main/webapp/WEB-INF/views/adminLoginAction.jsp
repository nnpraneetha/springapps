<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action</title>
</head>
<body>
	<%	
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("Praneetha")&& password.equals("admin")){
			response.sendRedirect("adminHome");
		}
		else{
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			pw.println("<center><h3><font color='red'>Login failed. Incorrect Username or Password</font></h3></center>");
			RequestDispatcher rd = request.getRequestDispatcher("adminlogin.jsp");
			rd.include(request, response);
		}
	%>
</body>
</html>