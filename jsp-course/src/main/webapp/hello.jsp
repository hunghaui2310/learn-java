<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<p>Hello JSP</p>
<a href="user/profile.jsp?id=1">Thong tin nguoi dung</a>
<a href="user/addUser.jsp">Add User</a>
<% 
int x = 10;
int y= 15;
int z= x + y;
%>
<h1>Z = <%=z %></h1>
<h3>${mvc}</h3>
<h2>This is User from Model</h2>
<h3>${user.name}</h3>
<h3>${user.address}</h3>
</body>
</html>