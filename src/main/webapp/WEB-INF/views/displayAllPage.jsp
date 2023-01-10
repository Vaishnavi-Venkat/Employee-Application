<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
<meta charset="UTF-8">
<title>Display All Page</title>
</head>
<body>
	<jsp:include page="homepage.jsp"></jsp:include>

	<h1>Employees List</h1>

	<table class="table table-bordered" border="2" align="center">

		<tr>
			<th>EmpId</th>
			<th>Name</th>
			<th>EmailId</th>
			<th>DOB</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Status</th>
			<th colspan="2">Actions</th>
		</tr>
		
		<c:forEach var="allemp" items="${emp }">

		<tr>
			<td>${allemp.id }</td>
			<td>${allemp.name }</td>
			<td>${allemp.email }</td>
			<td>${allemp.dob }</td>
			<td>${allemp.age }</td>
			<td>${allemp.salary }</td>
			<c:choose>
				<c:when test="${allemp.empstatus==true}">
					<td>Active</td>
				</c:when>
				<c:when test="${allemp.empstatus==false}">
					<td>Inactive</td>
				</c:when>
			</c:choose>
			
			<td><a href='./edit/${allemp.id }'>EDIT</a>
			<td><a href='./delete?id=${allemp.id }'>DELETE</a>
		</tr>
		</c:forEach>
	</table>
</body>
</html>