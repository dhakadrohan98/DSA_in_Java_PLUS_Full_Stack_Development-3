<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>

	<%@ page import="java.util.*" %>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("frnd");
	%>

	<h2>
		Name is
		<%=name%></h2>
	<h2>
		Id is
		<%=id%>
		<br>
	</h2>

	<h3>
		<%
		for (String s : friends) {
			out.println(s);
		%>
		<br>
		<%
		}
		%>
	</h3>

</body>
</html>