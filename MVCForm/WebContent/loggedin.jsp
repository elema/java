<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="header.txt" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loggedin</title>
</head>
<body>
<div class="container">
<h1>Welcome</h1>
<p class="text-success">You have successfully logged in as <%= request.getParameter("email") %></p>
</div>
</body>
</html>