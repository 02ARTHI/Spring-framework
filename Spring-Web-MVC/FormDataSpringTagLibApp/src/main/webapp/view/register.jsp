<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Telusko learning registration</title>
</head>
<body>
<center>
<h1 style='color:red; text-align:center'> Registration Application</h1>
<form:form method="post" modelAttribute="impl">
<table>

 <tr>
 <th> Implementers ID</th>
 <td> <form:input path="id"/> </td>
 </tr>
 
<tr>
 <th> Implementers name</th>
 <td><form:input path="iname"/></td>
 </tr>
 
 <tr>
 <th> Implementers city</th>
 <td><form:input path="icity"/></td>
 </tr>
 
 <tr>
 <th> Implementers salary</th>
 <td><form:input path="isalary"/></td>
 </tr>
 
 <tr>
 <td><input type="submit" value="register"></td>
 </tr>
 
</table>
</form:form>
</center>
</body>
</html>