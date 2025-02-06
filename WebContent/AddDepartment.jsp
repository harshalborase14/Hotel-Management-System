<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Deparment</title>
<%@include file="allcss.jsp" %>
<%@include file="adminnavbar.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<form action="./AddDepartmentServlet" method="post">
	<h1>Add Department</h1>
		Department Name :<input type="text" name="dept_name"><br><br>
		Budget (INR): <input type="text" name="budget"><br><br>
		<input type="submit" value="Submit">
	</form>
	<footer class="footer">
    	<p>&copy; 2025 Harshal. All rights reserved.</p>
	</footer>
</center>
</body>
</html>