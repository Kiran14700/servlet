<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<%  //scriplet tag
String myname =(String) session.getAttribute("name_key");  //getting values from session
%>
<h3>Welcome :<%= myname %></h3>
<a href="home.jsp">Home</a> &nbsp;&nbsp;
<a href="about-us.jsp">About us</a>
<a href="logout">logout</a>

</body>
</html>