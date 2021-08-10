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
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("name")) {
				String value = cookie.getValue();
				%>
				<h3>Cookie = <%=value%></h3>
				<%
			}
		}
	%>
	<h1> Them moi nguoi dung </h1>
	<form action='viewUser.jsp' method='post'>
		<input name='name' type='text' placeholder="Ten nguoi dung"><br>
		<input name='password' type='password' placeholder="Mat khau"><br>
		<input name='phone' type='text' placeholder="So dien thoai"><br>
		<textarea rows="3" cols="25" name='about' placeholder="Gioi thieu"></textarea><br>
		<input type='checkbox' name='favorite1' value='xemPhim'>Xem Phim
		<input type='checkbox' name='favorite2' value='ngheNhac'>Nghe Nhac
		
		<input type='submit' value='Submit'>
	</form>

</body>
</html>