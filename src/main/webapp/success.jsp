<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h2>Registration Successful</h2>
	<% String name=(String) session.getAttribute("uname"); %>
	<h3>Dear <%= name %>, Kindly Login to proceed further</h3>
	<form method="post" action="./Login">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>