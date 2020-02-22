<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gas Mileage || Results</title>
</head>
<body>
<h1>Gas Mileage</h1>
<h2>Results!</h2>

<p>Miles Per Gallon (MPG): <fmt:formatNumber value="${ mpg }" pattern="#.#" /></p>
<p>Gallons in Tank: <fmt:formatNumber value="${ gallons }" pattern="#.#" />gal</p>
<p>Distance Available: <fmt:formatNumber value="${ range }" pattern="#.#" />mi</p>
<p>${ tripDistance }</p>
<p><b>${ result }</b></p>

<p><a href="/">Home Page</a></p>
<p><a href="/gas/">Calculate another trip</a></p>
</body>
</html>