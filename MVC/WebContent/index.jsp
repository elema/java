<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.txt" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>MVC-Home</title>
</head>
<body>
<div class="container">
<h1>MVC Project</h1>
<p>
This is home of MVC project
</p>
<a href="/MVC/Controller?action=login" class="btn btn-large btn-primary">Login</a>
<a href="/MVC/Controller?action=about" class="btn btn-large btn-default">About Us</a>
</div>
</body>
</html>