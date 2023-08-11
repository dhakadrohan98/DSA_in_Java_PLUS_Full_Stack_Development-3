<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Form Response page</h1>
	<h3 class="text-center">${Header}</h3>
    <p class="text-center">${Desc}</p>
    <hr>
	
	<h2>user email is ${user.email} </h2>
	<h2>user name is ${user.name} </h2>
	<h2>user password is ${user.password}</h2>
	
	
</body>
</html>