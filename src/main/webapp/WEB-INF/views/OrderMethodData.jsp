<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	response.setIntHeader("refresh", 5);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#result {
	border-color: blue;
	border-radius: 5px;
	background-color: lightsalmon;
	color: white;
	margin: auto;
}

tr:hover {
	color: blue;
}
</style>
</head>
<body>
	<h2 style="text-align: center">Welcome to Order Result Page!!!!</h2>
	<table border="1" id="result">
		<tr>
			<th>ORDERID</th>
			<th>ORDERMODE</th>
			<!-- <th>ORDERCODE</th>
			<th>EXETYPE</th>
			<th>DESCRIPTION</th> -->
			<!-- <th>OrderAccpt</th> -->
			<th colspan="3">OPERATIONS</th>
		</tr>
		<tr>
			<c:forEach items="${lis}" var="sh">
				<td><c:out value="${sh.oid}"></c:out></td>
				<td><c:out value="${sh.orderMode}"></c:out></td>
				<%-- <td><c:out value="${sh.orderCode}"></c:out></td>
				<td><c:out value="${sh.exeType}"></c:out></td>
				<td><c:out value="${sh.orderDesc}"></c:out></td>
				<td><c:out value="${sh.orderAccept}"></c:out></td> --%>
				<td><a href="delete?oid=${sh.oid}">
				<img  src="../../resources/Image/Delete.png" height="20px" width="20px">
				</a></td>
				<td><a href="viewOne?oid=${sh.oid}">
<img src="../../resources/Image/view-file.png" height="15px" width="15px">
</a></td>
<td><a href="editOne?oid=${sh.oid}">
<img src="../../resources/Image/edit.png" height="15px" width="15px">
</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>