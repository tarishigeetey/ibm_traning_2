<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% String[] cities = {"Mumbai", "Pune", "Cochin", "Goa", "Kolkata", "Bengaluru"}; %>
 <form method="post" action= "save.do">
   <table border = "2">
      <tr><td>Code</td>
          <td><input name ="code"></td>
      </tr>
      <tr><td>From</td>
          <td><select name="from">
          <% for(String ct: cities){ %>
          <option value = "<%=ct %> "><%=ct %></option>
          <% } %>
          </select></td>
       <tr><td>To</td>
          <td><select name="to">
          <% for(String ct: cities){ %>
          <option value = "<%=ct %> "><%=ct %></option>
           <% } %>
          </select></td>
        <tr><td>Carrier</td>
           <td><input type = "radio" name ="carrier" value = "Indigo" checked>Indigo
               <input type = "radio" name ="carrier" value = "JetAirways">JetAirways
               <input type = "radio" name ="carrier" value = "AirIndia" >AirIndia
          </td>
          </tr>
          <tr><th colspan="2">
          <input type="submit" value = "Submit">
          </th></tr>
</body>
</html>