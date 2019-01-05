<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head></head>
<body>
<h2>Welcome to Order Method Page</h2>
<pre>
<form:form action="insert" method="POST" modelAttribute="orderMethod">
Order Mode:<form:radiobutton path="orderMode" value="SALE"/>SALE
           <form:radiobutton path="orderMode" value="PURCHASE"/>PURCHASE
Order Code:<form:input path="orderCode"/>
Execution Type:<form:select path="exeType">
			<form:option value="">--Select--</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select>
Order Accept: <form:checkbox path="orderAccept" value="MULTIMODEL"/>Multi-model
<form:checkbox path="orderAccept" value="ACCEPTRETURN"/>Accept-return
<form:checkbox path="orderAccept" value="POLICYRETURN"/>Policy-return
DESCPRTION :<form:textarea path="orderDesc"/>
<input type="submit" value="OrderCreate">
</form:form>
</pre>
${message}
</br>
<a href="all">View All</a>
</body>
</html>