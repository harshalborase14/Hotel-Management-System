<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Rooms</title>
<%@include file="allcss.jsp" %>
<%@include file="adminnavbar.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<form action="./AddRoomsServlet" method="post">
	<h1>Add Rooms</h1>
		Room No : <input type="text" name="roomno" required><br><br>
		Room Type : <select id="combobox" name="roomtype">
			<option value="single_bed">Single Bed</option>
			<option value="double_bed">Double Bed</option>
		</select><br><br>
		Availability : <select id="combobox" name="availability" required>
			<option value="available">Available</option>
			<option value="occupied">Occupied</option>
		</select><br><br>
		Price (INR) : <input type="text" name="price" required><br><br>
		<input type="submit" value="submit">
		
	</form>
	<br>
	<footer class="footer">
            <p>&copy; 2024 Harshal. All rights reserved.</p>
        </footer>
</center>
</body>
</html>