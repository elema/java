<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Index JSP</title>
</head>
<body>
	<%--@ page import="com.gartner.URLParameters" --%>
	<%@ page import="java.util.Date,com.gartner.TextOutput"%>
	<p><%="Hello from index jsp page"%></p>
	<p><%=new Date()%></p>
	<p><% TextOutput textout = new TextOutput(); %>
	<%= textout.getInfo() %>
	</p>
</body>
</html>