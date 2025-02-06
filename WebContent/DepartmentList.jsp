<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department List</title>
<%@include file="adminnavbar.jsp"%>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	<h1><b>All Departments</b></h1>
	<table border="2" cellpacing="S" cellpadding="20">
	<tr>
		<th>Department Name</th>
		<th>Budget</th>
	</tr>
	<%
	try
	{
			ResultSet rs = (ResultSet)session.getAttribute("rs");
			System.out.println("Data in DepartmentList.jsp");
			
			while(rs.next())
			{
			%>
			<tr>
				<td><%=rs.getString("dept_name") %></td>
				<td><%=rs.getString("budget") %></td>
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