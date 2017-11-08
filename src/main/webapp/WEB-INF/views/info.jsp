<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Info</title>
</head>
<body>
<%
//scriptlet
//System.out.println(request.getParameter("name"));
Date date = new java.util.Date();
%>

<%//expression language %>
<p>Blue is reed, wow such deep, enter your name</p>

<%//scriptlet expression %>
<p><%=date%></p>


<p>${errorMessage}</p>
<%//post request %>
<form action="/login.do" method="post">
	Enter your name 
	<input type="text" name ="inputName"/>
	<input type="password" name="inputPassword"/>
	<input type="submit" value="Login"/>
</form>

</body>
</html>