<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload CSV Page</title>
</head>
<body>
<center>
	<h1> Upload CSV File </h1> <hr/>
	<form action="upload/csvFile" method="POST" enctype="multipart/form-data">
	Select CSV File <bt/>
	<input type="file" name="file" accept=".csv"> <br/><br/>
	<input type="submit" value="UPLOAD">
	</form>
</center>
</body>
</html>