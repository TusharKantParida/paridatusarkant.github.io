<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
</head>
<body
	style="font-family: consolas; font-size: 20px; color: red; text-align: center;">
	<h2>Welcome to WhUser Data Page</h2>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>TYPE</th>
			<th>CODE</th>
			<!-- <th>FOR TYPE</th>
			<th>EMAIL</th>
			<th>CONTACT</th>
			<th>ID TYPE</th>
			<th>IF OTHER</th>
			<th>ID NUMBER</th>-->
			<th>OPERATION</th> 
		</tr>
		<c:forEach items="${list }" var="whuser">
			<tr>
				<td><c:out value="${whuser.userId }" /></td>
				<td><c:out value="${whuser.userType }" /></td>
				<td><c:out value="${whuser.userCode }" /></td>
				<%--  <td><c:out value="${whuser.forType }" /></td>
				<td><c:out value="${whuser.userEmail }" /></td>
				<td><c:out value="${whuser.usercontact }" /></td>
				<td><c:out value="${whuser.idType }" /></td>
				<td><c:out value="${whuser.ifOther }" /></td>
				<td><c:out value="${whuser.idNum }" /></td> --%>
				<td><a href="delete?uid=${whuser.userId}">
<img src="../resources/Image/Delete.png" height="20" width="20" >
</a>
</td>
<td><a href="viewOne?uid=${whuser.userId}">
<img src="../resources/Image/view-file.png" height="20" width="20">
</a></td>
<td><a href="editOne?uid=${whuser.userId}">
<img src="../resources/Image/edit.png" height="20" width="20">
</a></td>
				
			</tr>
		</c:forEach>
	</table>
	${message }
</body>
</html>