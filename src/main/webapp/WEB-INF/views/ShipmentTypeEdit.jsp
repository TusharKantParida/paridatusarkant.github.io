<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form:form action="update" method="POST" modelAttribute="shipment">
<pre>
Shipment Id:<form:input path="id" readonly="true"/>
Shipment Mode:<form:select path="shipMode">
			<form:option value="TRUCK">Truck</form:option>
			<form:option value="BUS">Bus</form:option>
			<form:option value="AIR">Air</form:option>
</form:select>
Shipment Code:<form:input path="shipCode"/>
Enable Shipment:<form:select path="enableShipment">
<form:option value="">--Select--</form:option>
<form:option value="YES">Yes</form:option>
<form:option value="NO">No</form:option>
</form:select>
<form:radiobutton path="shipGrad" value="A"/>A
<form:radiobutton path="shipGrad" value="B"/>B
<form:radiobutton path="shipGrad" value="C"/>C

DESCPRTION :<form:textarea path="shipDesc"/>
<input type="submit" value="update">
</pre>
</form:form>
${message}
</br>
</body>
</html>