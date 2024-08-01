<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure</title>
</head>
<body>
	<h2>Registration Failed</h2>
	<% String name=(String) session.getAttribute("uname"); %>
	<h3>Dear <%= name %>, Kindly Register Again</h3>

	
</body>
</html>