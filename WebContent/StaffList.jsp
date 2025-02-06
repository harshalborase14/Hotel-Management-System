<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="adminnavbar.jsp" %>
<%@ include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<h1>All Staffs List</h1>
	<table border="2" cellpacing="S" cellpadding="20">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Email</th>
		<th>DOB</th>
		<th>Department</th>
		<th>Salary</th>
	</tr>
	<%
	try
	{
			ResultSet rs = (ResultSet)session.getAttribute("rs");
			System.out.println("Data in StaffList.jsp");
			
			while(rs.next())
			{
			%>
			<tr>
				<td><%=rs.getString("empid") %></td>
				<td><%=rs.getString("e_name") %></td>
				<td><%=rs.getString("gender") %></td>
				<td><%=rs.getString("email") %></td>
				<td><%=rs.getString("dob") %></td>
				<td><%=rs.getString("department") %></td>
				<td><%=rs.getString("salary") %></td>
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