<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--Comment --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Hello Beautiful Mind</h1>
 <h2>Welcome to Java Server Pages</h2>
 <%!int counter = 0; %>
 <h3>You are visitor no: <%= ++counter %></h3>
 <% Date now = new Date(); %>
 <h3> Log : <%= now %></h3>
</body>
</html>