<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gas Mileage || Calculator</title>
</head>
<body>

<h1>Gas Mileage</h1>
<h2>Calculator</h2>
<form method="post" action="/gas/mileage-result">

<p>Miles Per Gallon (MPG):
<input type="number" name="mpg" min="5" max="70" step="0.5">
</p>

<p>Gallons in Tank:
<input type="number" name="gallons" min="0.5" max="300" step="0.5">
</p>

<p>Trip Distance:
<input type="number" name="distance" min="5" max="2100" step="5">
</p>
<input type="submit" value="How far can you go?" />

</form>
<p><a href="/">Home Page</a></p>
</body>
</html>