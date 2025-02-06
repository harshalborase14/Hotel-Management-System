<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check In</title>
<%@include file="allcss.jsp" %>
<%@include file="usernavbar.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<form action="./CheckinServlet" method="post">
		<h1>Check-In Form</h1>
		Adhar No : <input type="text" name="adharno" required><br><br>
		First name : <input type="text" name="fname" required><br><br>
		Last name : <input type="text" name="lname" required><br><br>
		Phone No : <input type="text" name="phoneno" required><br><br>
		Gender : <select id="combobox" name="gender" required>
			<option value="male">Male</option>
			<option value="Female">Female</option>
			<option value="Other">Other</option>
		</select>
		<br><br>
		Room No : <select id="combobox" name="roomno" required>
			<%
			try
			{
				ResultSet rs = (ResultSet)session.getAttribute("rs");
				while(rs.next())
				{
					%>
					<option value="<%=rs.getString("room_no")%>"><%=rs.getString("room_no") %></option>
					<%
				} 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			%>
		</select><br></b>
		Deposit (INR) : <input type="text" name="deposit" required>
		<br><br>
		Chek-In Date : <input type="date" name="checkindate" required><br><br>
		Chek-In Time : <input type="time" name="checkintime" required><br><br>
		<input type="submit" value="Check-In">
	</form>
	<footer class="footer">
            <p>&copy; 2024 Harshal. All rights reserved.</p>
        </footer>
</center>
</body>
</html>