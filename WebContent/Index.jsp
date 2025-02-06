<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Management</title>
<%@include file="allcss.jsp" %>
<style>
/* Reset margin and padding for full height */
html, body {
    height: 100%;
    margin: 0;
}

/* Ensure the container fills the available space */
.container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    height: 100%;
}

/* Style for footer */
.footer {
    text-align: center;
    padding: 10px;
    background-color: #f1f1f1;
    position: fixed;
    bottom: 0;
    width: 100%;
    left: 0;
}

/* Center align text and buttons */
.center {
    text-align: center;
}

/* Button style adjustments */
.btn {
    margin-top: 10px;
    font-size: 16px;
}

h1 {
    margin-bottom: 20px;
}
</style>
</head>
<body>
<div class="container">
	<center>
		<h1>Hotel Management System</h1>
		<a href="AdminLogin.jsp"><button class="btn btn-outline-success my-2 my-sm-0"><i class="fa-solid fa-user-tie mr-2"></i>Admin</button></a>
		<br><br>
		<a href="UserLogin.jsp"><button class="btn btn-outline-success my-2 my-sm-0"><i class="fa fa-address-book mr-2"></i>Reception</button>
	
		<footer class="footer">
        	    <p>&copy; 2024 Harshal. All rights reserved.</p>
    	</footer>
	</center>
</div>
</body>
</html>