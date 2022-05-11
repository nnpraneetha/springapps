<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function add() {
		var cat = document.form.category.value;
		var img = document.form.pic.value;
		let str = "/resources/images/";
		let res = str.concat("", cat);
		let result = res.concat("/", img);
		document.getElementById("image").value = result;
	}
</script>

</head>
<body>
	<%@include file="adminlogin.jsp"%><br>
	<br>
	<center>
		<p style="color: blue">
			<b>${result }</b>
		</p>
	</center>
	<br>
	<center>
		<h2>Details of Product:</h2>
	</center>
	<form action="addproduct" method="post">

		<table align="center">

			<tr>
				<td>Name</td>
				<td><input type="text" name="name" required /></td>
			</tr>
			<tr>
				<td>Company:</td>
				<td><input type="text" name="company" required /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" required /></td>
			</tr>
			<tr>
				<td>Category:</td>
				<td><select name="category" required>
						<option value="" disabled selected>Select option</option>
						<option value="men">men</option>
						<option value="women">women</option>
				</select></td>
			</tr>
			<tr>
				<td>Image:</td>
				<td><input type="file" name="image" accept="image/*" /></td>


			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Add Product"></td>
			</tr>
		</table>
	</form>


</body>
</html>