<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Manipulation</title>
</head>
<body>
<h4>Scripting html in jsp</h4>
<% for(int i=0; i < 5; i++){ %>	
<p><% out.println("this is sentence number " + i);%></p>	
<% }%>
<% String id = request.getParameter("id");
if(id == null) { %>
<strong>id missing</strong>
<% } else {%>
<strong>id: <%= id %></strong>
<% } %>
</body>
</html>