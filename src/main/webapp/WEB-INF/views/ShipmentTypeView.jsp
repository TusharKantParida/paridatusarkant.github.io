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
<td>${lis.id}</td>
</tr>
<tr>
<td>MODE</td>
<td>${lis.shipMode}</td>
</tr>
<tr>
<td>CODE</td>
<td>${lis.shipCode}</td>
</tr>
<tr>
<td>ENABLED</td>
<td>${lis.enableShipment}</td>
</tr>
<tr>
<td>GRADE</td>
<td>${lis.shipGrad}</td>
</tr>
<tr>
<td>ID</td>
<td>${lis.shipDesc}</td>
</tr>
</tbody>
</table>
<a href="all">COME BACK</a>
</body>
</html>