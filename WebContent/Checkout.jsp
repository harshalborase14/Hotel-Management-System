<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="allcss.jsp" %>
<%@include file="usernavbar.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<form action="./checkout" method="post">
		<h1>Check-out</h1>
		Adhar No : <input type="text" name="adharno"><br><br>
		First Name : <input type="text" name="fname"><br><br>
		Last Name : <input type="text" name="lname"><br><br>
		Room No : <input type="text" name="roomno"><br><br>
		Check-Out Date : <input type="date" name="checkoutdate"><br><br>
		Check-Out Time : <input type="time" name="checkouttime"><br><br>
		<input type="submit" value="Check-Out">
	</form>
	
	<footer class="footer">
        	    <p>&copy; 2024 Harshal. All rights reserved.</p>
    	</footer>
</center>
</body>
</html>