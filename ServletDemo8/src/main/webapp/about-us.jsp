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
String myname =(String) session.getAttribute("name_key");
%>
<h3>Welcome :<%= myname %></h3>
<a href="home.jsp">Home</a> &nbsp;&nbsp;
<a href="profile.jsp">About us</a>

</body>
</html>