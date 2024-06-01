<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>response page</title>
</head>
<body>
<center>
<h1 style='color:red; text-align:center'>display data from array</h1>
<p>Name of the books</p>
<c:forEach var="booksName" items="${books}">${booksName}</c:forEach>
</center>
</body>
</html>