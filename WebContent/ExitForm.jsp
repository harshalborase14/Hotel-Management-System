<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exit Form</title>
<%@include file="allcss.jsp" %>
<%@include file="adminnavbar.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
	<center>
		<form action="./exit" method="post">
			<h1>Exit Form</h1>
			Name: <input type="text" name="name"><br><br>
			Employee ID: <input type="text" name="empid"><br><br>
			Exit Date:<input type="date" name="date"><br><br>
			<input type="submit" value="Submit">
		</form>
		<footer class="footer">
            <p>&copy; 2024 Harshal. All rights reserved.</p>
        </footer>
	</center>
</body>
</html>