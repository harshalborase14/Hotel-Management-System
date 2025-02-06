<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	
	<form action="./userRegisterServlet" method="post">
	<h1>User Form</h1>
		State : <input type="text" name="state"><br><br>
		City : <input type="text" name="city"><br><br>
		Hotel Name : <input type="text" name="hotelname"><br><br>
		UserName : <input type="text" name="username"><br><br>
		Password : <input type="password" name="password"><br><br>
		<input type="submit" value="submit">
	</form>
	<footer class="footer">
            <p>&copy; 2024 Harshal. All rights reserved.</p>
    </footer>
</center>
</body>
</html>