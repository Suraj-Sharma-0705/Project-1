<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> HELP Page</title>
</head>
<body>

	<%
		/* String name=(String)request.getAttribute("name");
		Integer rollno=(Integer)request.getAttribute("rollnumber");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time");
 */	%>
	

	<h1>Hello Everyone my name is 
		<%-- <%=name %> --%>
		${name}
	</h1>
	
	<h2>This is the help page</h2>
	<h1> My Id is 
		<%-- <%=rollno %> --%>
		${rollnumber}
	</h1>
	
	<h1> Date and time isTime is 
		<%-- <%=time.toString()%>  --%>
		${time}
	</h1>
	<hr>
	<c:forEach var="item" items="${marks }">
		<h2>${item }</h2>
	
	</c:forEach>	
	
</body>
</html>