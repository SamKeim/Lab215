
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tip Calculator || Calculator</title>
</head>
<body>
<h1>Tip Calculator</h1>
<h2>Calculator</h2>
<form method="post" action="/tip/result">

<p>Amount of Bill:
<input type="number" name="bill" min="5" max="300" step="1">
</p>
<p>Amount of Tip:
<label><input type="radio" name="percentage" value="0.15" />15%</label>
<label><input type="radio" name="percentage" value="0.18" />18%</label>
<label><input type="radio" name="percentage" value="0.20" />20%</label>
<label><input type="radio" name="percentage" value="0.01" />Custom</label>


<input type="number" name="cpercentage" min="0" max="100" step="1" value="0">%

</p>

<input type="submit" value="Calculate Tip" />

</form>
<p><a href="/">Home</a></p>

</body>
</html>