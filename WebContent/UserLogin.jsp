<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	
	<form action="./UserLoginServlet" method="post">
	<h1>Reception Login</h1>
		User Name : <input type="text" name="username"><br><br>
		Password : <input type="password" name="password"><br><br>
		<input type="submit" value="Login">
	</form>
	<br>
	<a href="UserRegister.jsp">Sign Up</a><br>
	<a href="Index.jsp">Back</a>
	
	<footer class="footer">
            <p>&copy; 2024 Harshal. All rights reserved.</p>
    </footer>
</center>
</body>
</html>