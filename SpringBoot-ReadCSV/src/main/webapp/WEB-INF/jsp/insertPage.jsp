<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method = "POST">
	Enter Roll <br/>
	<input type="text" name="roll"> <br/>
	Enter Name <br/>
	<input type="text" name="sname"> <br/>
	Enter Address <br/>
	<input type="text" name="address"> <br/>
	<br/>
	<input type="submit" value="Submit">
</form>
<hr/>
<span>${msg }</span>
</body>
</html>