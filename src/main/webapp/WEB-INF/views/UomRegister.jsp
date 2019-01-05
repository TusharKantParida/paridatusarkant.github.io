<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head></head>
<body>
<h2>Welcome to UomRegister page</h2>
<form:form action="insert" method="POST" modelAttribute="uomR">
<pre>
Uom Type:<form:select path="uomType">
            <form:option value="">--select--</form:option>
			<form:option value="PARKING">Parking</form:option>
			<form:option value="NON-PARKING">No parking</form:option>
</form:select>
Uom Model:<form:input path="uomModel"/>
Description:<form:textarea path="uomDesc"/>
<input type="submit" value="CreateUom">
</pre>
</form:form>
${message}
</br>
<a href="all">View All</a>
</body>
</html>