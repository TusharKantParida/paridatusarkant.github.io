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
	background-image:
		url("E:\Project\warehouse\src\main\webapp\WEB-INF\Image\image5.jpeg");
	color: white;
	margin: auto;
}

tr:hover {
	color: blue;
}
</style>
</head>
<body>
	<h2 style="text-align: center">Welcome to Uom Result Page!!!!</h2>
	<table border="1" id="result">
		<tr>
			<th>ID</th>
			<th>TYPE</th>
			<!-- <th>MODEL</th>
			<th>DESCRIPTION</th> -->
			<th colspan="3">OPERATIONS</th>
		</tr>
		<tr>
			<c:forEach items="${lis}" var="sh">
				<td><c:out value="${sh.id}"></c:out></td>
				<td><c:out value="${sh.uomType}"></c:out></td>
				<%-- <td><c:out value="${sh.uomModel}"></c:out></td>
				<td><c:out value="${sh.uomDesc}"></c:out></td> --%>
				<td><a href="delete?uid=${sh.id}">
				<img src="../resources/Image/Delete.png" height="20" width="20">
				</a></td>
				<td><a href="viewOne?uid=${sh.id}">
<img src="../resources/Image/view2.png" height="20" width="20">
</a></td>
<td><a href="editOne?uid=${sh.id}">
<img src="../resources/Image/edit.png" height="20" width="20">
</a></td>

		</tr>
		</c:forEach>
	</table>
</body>
</html>