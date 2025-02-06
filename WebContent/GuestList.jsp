<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guest List</title>
<%@include file="usernavbar.jsp"%>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<h1><b>Guest</b></h1>
	<table border="2" cellpacing="S" cellpadding="20">
	<tr>
		<th>Adhar No</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Phone No</th>
		<th>Room No</th>
		<th>Deposit</th>
		<th>Check In Date</th>
		<th>Check In Time</th>
	</tr>
	<%
	try
	{
			ResultSet rs = (ResultSet)session.getAttribute("rs");
			System.out.println("Data in GuestList.jsp");
			
			while(rs.next())
			{
			%>
			<tr>
				<td><%=rs.getString("adhar_no") %></td>
				<td><%=rs.getString("f_name") %></td>
				<td><%=rs.getString("l_name") %></td>
				<td><%=rs.getString("gender") %></td>
				<td><%=rs.getString("phone_no") %></td>
				<td><%=rs.getString("roomno") %></td>
				<td><%=rs.getString("deposit") %></td>
				<td><%=rs.getString("check_in_date") %></td>
				<td><%=rs.getString("check_in_time") %></td>
			</tr>
			<%
			}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	%>
	</table>
	<footer class="footer">
            <p>&copy; 2024 Harshal. All rights reserved.</p>
        </footer>
</center>
</body>
</html>