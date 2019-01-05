<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
response.setIntHeader("refresh",600);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#result{
border-color: blue;
border-radius: 5px;
background-color: lightsalmon;
color: white;
margin: auto;
}
tr:hover{
color: blue;
}
</style>
</head>
<body>
<h2 style="text-align: center">Welcome to Uom Result Page!!!!</h2>
<table border="1" id="result">
<tr>
<td>ID</td>
<td>${lis.id}</td>
</tr>
<tr>
<td>TYPE</td>
<td>${lis.uomType}"></td>
</tr>
<tr>
<td>MODEL</td>
<td>${lis.uomModel}</td>
</tr>
<tr>
<td>DESC</td>
<td>${lis.uomDesc}</td>
</tr>
</table>
<a href="all">COME BACK</a>
</body>
</html>