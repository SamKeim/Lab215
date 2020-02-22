<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tip Calculator || Results</title>
</head>
<body>
<h1>Tip Calculator</h1>
<h2>Results</h2>



<p>Bill: <fmt:formatNumber value="${ bill }" type="currency" /></p>
<p>Tip: <fmt:formatNumber value="${ percentage }" type="percent" minFractionDigits="1" /></p>
<p>Tip Amount: <fmt:formatNumber value="${ result }" type="currency" /></p>

<p><a href="/">Home</a></p>
<p><a href="/tip/tip-form">Calculate another bill</a></p>

</body>
</html>