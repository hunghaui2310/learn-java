<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<p>Profile Page</p>
<%
	String id = request.getParameter("id");
%>
<h1>ID = <%=id %></h1>
<a href="logout.jsp">Logout</a>
</body>
</html>