<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Base</title>
</head>
<body>
	<h1>Book Base</h1>
	<form action="getInfoServlet" method="post">
	Enter the book ID you are searching for:
	<input type="text" name="bookInfo" size="10">
	<input type="submit" value="Search" />
	</form>
</body>
</html>