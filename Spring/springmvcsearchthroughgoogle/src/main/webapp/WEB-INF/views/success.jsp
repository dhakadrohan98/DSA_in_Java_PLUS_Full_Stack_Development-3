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

	<h1>Student's Name is ${student.name}</h1>
	<h1>Student's DOB is ${student.date}</h2>
	<h1>Student's courses are ${student.courses} </h2>
	<h1>Student's address street is ${student.address.street}</h2>
	<h1>Student's address city is ${student.address.city}</h2>
</body>
</html>