<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read CSV File</title>
</head>
<body>
<center>
	<h1>Read CSV File Record</h1> <hr/>
	<h4>${msg }</h4>
	<table border="5" width="40%">
		<tr>
			<th> Roll </th>
			<th> Name </th>
			<th> Address </th>
		</tr>
			<c:forEach var="tab" items="${data }">
		<tr>
			<td> ${tab.roll } </td>
			<td> ${tab.sname } </td>
			<td> ${tab.address} </td>
		</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>