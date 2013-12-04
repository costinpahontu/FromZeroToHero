<%@ page language="java" contentType="text/html"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body style="background:red;">
<h2>Hello employee!</h2>
<p>${message}</p>
<table style= "padding-left:400px;">

<thead style="color:blue;border:1px solid green;">
<th>Nume</th>
<th>Prenume</th>
<th>email</th>
<th>password</th>
</thead>

<c:forEach var="employee" varStatus="status" items="${employeeList}">
  <tr>
		  <td style="border:1px solid blue;"> ${employee.lastName}</td>
		  <td style="border:1px solid blue;">${employee.firstName}</td>
		  <td style="border:1px solid blue;">${employee.email} </td>
		  <td style="border:1px solid blue;">${employee.password }</td>
  </tr>
</c:forEach>

</table>
</body>
</html>
