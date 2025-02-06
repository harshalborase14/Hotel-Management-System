<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Staff</title>
<%@include file="adminnavbar.jsp" %>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/cssfile.css">
</head>
<body>
<center>
	
	<form action="./addstaff" method="post">
	
		<h1>Register Employee Job</h1>
	
		Employee ID :<input type="text" name="empid" required><br><br>
		
		Name :<input type="text" name="name" required><br><br>
		
		Gender : <select id="gender" name="gender" required>
			<option value="male">Male</option>
			<option value="female">Female</option>
		</select><br><br>
		
		Email : <input type="email" name="email" required>
		
		Date Of Birth : <input type="date" name="dob" required><br><br>
		
		Department : <select id="dept" name="dept" required>
		<%
		try
		{
			ResultSet rs = (ResultSet)session.getAttribute("rs");
			while(rs.next())
			{
				%>
				<option value="<%= rs.getString("dept_name")%>"><%=rs.getString("dept_name") %></option>
				<%
			}
		}
		catch(Exception e)
		{
			System.out.println("AddStaff.jsp : "+e);
		}
		%>
		</select><br><br>
		
		Salary : <input type="text" name="salary"><br><br>
		
		<input type="submit" value="Submit">
	</form>
	
	<footer class="footer">
    	<p>&copy; 2025 Harshal. All rights reserved.</p>
	</footer>
</center>
</body>
</html>