<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style type="text/css">

</style>
</head>
<body>
<div id="ship">
<h2>Welcome to Shipment Page!!</h2>
<form:form action="insert" method="POST" modelAttribute="shipment">
<pre>
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
<input type="submit" value="CreateShipment">
</pre>
</form:form>
</div>
${message}
</br>
<a href="all">View All</a>
</body>
</html>