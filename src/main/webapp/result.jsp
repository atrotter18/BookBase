<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<h1>Book Information</h1>
	<p>Book Id: ${bookContent.getBookId()} <br />
    Title: ${bookContent.getTitle()} <br />
    Status: ${bookContent.isCheckedOut() ? "Checked Out" : "Checked In"} <br />
    </p>
    <a href="index.jsp">Check status on another book</a>
</body>
</html>