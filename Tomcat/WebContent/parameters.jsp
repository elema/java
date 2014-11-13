<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>parameters jsp</title>
</head>
<body>
<%
String user = request.getParameter("user");
String id = request.getParameter("id");
%>
<p><%= "user: " + user %></p>
<% if(id == null) {%>
<jsp:include page="idmissing.html" />
<% } else {%>
<jsp:include page="idfound.html" />
<% } %>
<!-- static include -->
<p><%@ include file="copyright.txt" %> | 
<!-- dynamic include -->
<jsp:include page="year.jsp" />
</p>
</body>
</html>