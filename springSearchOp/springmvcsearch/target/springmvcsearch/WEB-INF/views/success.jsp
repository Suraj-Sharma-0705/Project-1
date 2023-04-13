<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Student's name is ${ student.name }</h1>
	<h1>Student's ID is ${ student.id }</h1>
	<h1>Student's Courses is ${ student.courses }</h1>
	<h1>Student's gender is ${ student.gender }</h1>
	<h1>Student's type is ${ student.type }</h1>
	<hr>
	<h1>Address Street is ${ student.address.street }</h1>
	<h1>Address City is ${ student.address.city }</h1>
	
</body>
</html>