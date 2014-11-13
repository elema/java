<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form handler</title>
</head>
<body>
	<jsp:useBean id="user1" class="beans.User" scope="session" />
	<jsp:setProperty property="*" name="user1" />
	Email: <%=user1.getEmail()%><br> 
	Password: <%=user1.getPassword()%>
</body>
</html>