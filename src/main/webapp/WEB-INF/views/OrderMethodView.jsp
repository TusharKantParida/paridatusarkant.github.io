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
<h2 style="text-align: center">Welcome to Shipment Result Page!!!!</h2>
<table border="1" id="result">
<tr>
<td>ID</td>
<td>${lis.oid}</td>
</tr>
<tr>
<td>MODE</td>
<td>${lis.orderMode}</td>
</tr>
<tr>
<td>CODE</td>
<td>${lis.orderCode}</td>
</tr>
<tr>
<td>EXETYPE</td>
<td>${lis.exeType}</td>
</tr>
<tr>
<td>DESC</td>
<td>${lis.orderDesc}</td>
</tr>
<tr>
<td>ORDER</td>
<td>${lis.orderAccept}</td>
</tr>
</table>
<a href="all">COME BACK</a>
</body>
</html>