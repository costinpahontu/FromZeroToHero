<%@ page language="java" contentType="text/html"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html >
<body style="background:#666392;">
<h2>Hello World!</h2>
<p>${message}</p>

<table >

		<thead>
		<th>id</th>
		<th>name</th>
		</thead>
		<c:forEach var="roll" varStatus="status" items="${rollList}">
		<tr>
				<td>${roll.id }</td>
				<td>${roll.name }</td>
		
		</tr>
       </c:forEach>

</table>


</body>
</html>
