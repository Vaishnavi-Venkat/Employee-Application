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
<title>Display page</title>
</head>
<body>
	<jsp:include page="homepage.jsp"></jsp:include>

	<c:choose>
		<c:when test="${msg.getClass().getSimpleName().equals(\"String\") }">
			<h2>${msg }</h2>
		</c:when>
		<c:when test="${msg.getClass().getSimpleName().equals(\"EmployeeDto\") }">
		<div class="container">
			<table class="table table-bordered" border="2" align="center">

				<tr>
					<th>EmpId</th>
					<th>Name</th>
					<th>EmailId</th>
					<th>DOB</th>
					<th>Age</th>
					<th>Salary</th>
					<th>Status</th>
				</tr>

				<tr>
					<td>${msg.id }</td>
					<td>${msg.name }</td>
					<td>${msg.email }</td>
					<td>${msg.dob }</td>
					<td>${msg.age }</td>
					<td>${msg.salary }</td>
					<c:choose>
						<c:when test="${msg.empstatus==true}">
							<td>Active</td>
						</c:when>
						<c:when test="${msg.empstatus==false}">
							<td>Inactive</td>
						</c:when>
						</c:choose>
					
				</tr>
			</table>
			</div>
		</c:when> 
	</c:choose>

</body>
</html>