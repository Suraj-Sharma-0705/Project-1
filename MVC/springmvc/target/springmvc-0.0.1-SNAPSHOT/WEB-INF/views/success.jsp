<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successfully Logged in !!!</title>
</head>
<body>
	
	<h1 class="text-center">${Header }</h1>
	<h2 class="text-center">${Desc }</h2>
	
	<h1> Welcome , ${user.userName}</h1>
	<h2> Your email is ${user.email}</h2>
	<h2> Your password is ${user.password} try to secure the password</h2>
	
</body>
</html>