<%@page import="java.time.LocalDateTime"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
		/* String name = (String)request.getAttribute("name");
		Integer rollno = (Integer)request.getAttribute("rollno");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time"); */
	%>
	
	<h1>This is help page</h1> 
	<h2>My name is <%-- <%= name %> --%> 
		${name} </h2>
	<h3>My rollno. is <%-- <%= rollno	 %> --%> 
		${rollno} </h3>
	<h3>Current Date & Time is <%-- <%= time.toString() %> --%> 
		${time }</h3>
		<hr>
		
	<h3>Student marks list is:</h3>
	
	<c:forEach var="item" items="${marks }">
	
		<%-- <h3>${item }</h3> --%>
		<c:out value="${item}"></c:out>
		<br>
		
	</c:forEach>
	
</body>
</html>