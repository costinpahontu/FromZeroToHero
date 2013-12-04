<%@ page language="java" contentType="text/html"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html >
<body style="background:green;">
<h2>Hello admin!</h2>
<p>${message}</p>
<table style= "padding-left:200px;">

<thead style="color:blue;border:1px solid blue;">
<th>Nume</th>
<th>Prenume</th>
<th>email</th>
<th>password</th>
</thead>

<c:forEach var="admin" varStatus="status" items="${adminList}">
  <tr>
		  <td style="border:1px solid blue;"> ${admin.lastName}</td>
		  <td style="border:1px solid blue;">${admin.firstName}</td>
		  <td style="border:1px solid blue;">${admin.email} </td>
		  <td style="border:1px solid blue;">${admin.password }</td>
  </tr>
</c:forEach>

</table>
</body>
</html>
