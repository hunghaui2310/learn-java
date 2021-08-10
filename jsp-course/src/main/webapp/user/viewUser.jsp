<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String phone = request.getParameter("phone");
	String about = request.getParameter("about");
	String favorite1 = request.getParameter("favorite1");
	String favorite2 = request.getParameter("favorite2");
	String fav = "";
	if (favorite1 != null) {
		fav += favorite1 + " ";
	}
	if (favorite2 != null) {
		fav += favorite2;
	}
	%>
	
	<table>
		<tr>
			<td>Ten</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>Mat khau</td>
			<td><%= password %></td>
		</tr>
		<tr>
			<td>So dien thoai</td>
			<td><%= phone %></td>
		</tr>
		<tr>
			<td>Gioi thieu</td>
			<td><%= about %></td>
		</tr>
		<tr>
			<td>So thich</td>
			<td><%= fav %></td>
		</tr>
	</table>
	<a href='addUser.jsp'>Add User</a>
	<%
		Cookie cookie = new Cookie("name", "HungNN");
		response.addCookie(cookie);
	%>
</body>
</html>