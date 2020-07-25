<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Display Student Record</h1> <hr/>
	<span>${msg }</span>
	<table border="5" width="30%">
		<tr>
			<th> Roll </th>
			<th> Name </th>
			<th> Address </th>
		</tr>
			<c:forEach var="tab" items="${data }">
		<tr>  
			<td> ${tab.roll } </td>
			<td> ${tab.sname } </td>
			<td> ${tab.address } </td>
		</tr>
		</c:forEach>
	</table>
	<hr/>
	To download <a href="download/student.csv"> Click here... </a>
</center>
</body>
</html>