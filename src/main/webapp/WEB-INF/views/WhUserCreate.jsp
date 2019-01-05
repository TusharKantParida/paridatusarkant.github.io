<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<h2>Welcome to Wh User Create Page</h2>
	<form:form action="insert" method="POST" modelAttribute="userType">
		<pre>
User Type:<form:radiobutton path="userType" value="Vendor" />Vendor  <form:radiobutton
				path="userType" value="Customer" />Customer  
User Code:<form:input path="userCode" />
User For:<form:select path="forType">
		 <form:option value="">--SELECT--</form:option>
		 <form:option value="Purchase">Purchase</form:option>
		 <form:option value="Sale">Sale</form:option>
		 </form:select>
User Email:<form:input path="userEmail" />
User Contact:<form:input path="usercontact" />
User ID type:<form:select path="idType">
			 <form:option value="">--SELECT--</form:option>
			 <form:option value="PanCard">PANCARD</form:option>
			 <form:option value="Aadhar">AADHAR</form:option>
			 <form:option value="VoterId">VOTER ID</form:option>
			 <form:option value="Other">OTHER</form:option>
			 </form:select>
ID Number:<form:input path="IdNum" />
<input type="submit" value="CreateWhUser">			 		 
</pre>

	</form:form>
	${message }
	</br>
<a href="all">View All</a>
</body>
</html>