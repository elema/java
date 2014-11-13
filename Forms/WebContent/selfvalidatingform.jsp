<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
	<jsp:useBean id="user2" class="beans.User" scope="session" />
	<jsp:setProperty property="*" name="user2" />
	<% 
	String action = request.getParameter("action");
	if(action != null && action.equals("formsubmit")){
		if(user2.validate()){
			request.getRequestDispatcher("/Controller").forward(request, response);
		}
	}
	%>
	<p><jsp:getProperty property="message" name="user2" /></p>
	<form action="/Forms/selfvalidatingform.jsp" method="post">
		<input type="hidden" name="action" value="formsubmit" />
		<input type="text" name="email" value="<jsp:getProperty property="email" name="user2" />" placeholder="somename@domain.ext"/><br>
		<input type="password" name="password" value="<jsp:getProperty property="password" name="user2" />" placeholder="password" /> <br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>