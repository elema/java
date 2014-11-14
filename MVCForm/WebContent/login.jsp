<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="header.txt" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div class="container">
<form action="Controller" method="post">
<input type="hidden" name="action" value="dologin" /><br>
Email: <input type="text" name="email" value="<%= request.getAttribute("email") %>" /><br>
Password: <input type="text" name="password" value="<%= request.getAttribute("password") %>" /><br>
<input type="submit" value="login" class="btn btn-large btn-primary" />
</form>
<h6 class="text-danger"><%= request.getAttribute("message") %></h6>
</div>
</body>
</html>