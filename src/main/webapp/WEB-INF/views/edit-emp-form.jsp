<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">

<script type="text/javascript">
function calculateAge()
{
	let age=document.getElementById("dob").value;
	console.log(age);
	var dob=new Date(age);
	var today=new Date();
	var currentAge=today.getTime()-dob.getTime();
	var Age=Math.floor((currentAge/(1000*60*60*24*365.25)));
	Age=document.getElementById("age").value=Age;
	
}
</script>
<title>Edit Page</title>
</head>
<body>

<div class="col-xs-4">
<form action="/employee-app-springmvc/update" method="post">

<label>Employee_ID</label>
<input type="number" class="form-control" name="id" value="${emp.id }">

<label>Name</label>
<input type="text" class="form-control" name="name" value="${emp.name }">
<br><br>

<label>Email Id</label>
<input type="email" class="form-control" name="email" value="${emp.email }">
<br><br>

<label>DOB</label>
<input type="date" class="form-control" name="dob" value="${emp.dob }">
<br><br>

<label>Age</label>
<input type="number" class="form-control" id="age" readonly="readonly" onmouseover="calculateAge()"name="age" value="${emp.age }">
<br><br>

<label>Salary</label>
<input type="number" class="form-control" name="salary" value="${emp.salary }">
<br><br>

<label>Status</label>
<c:choose>
<c:when test="${emp.empstatus==true}">
<label for="active" class="radio-inline">Active</label><input type="radio" name="empstatus" value="Active" checked="checked" id="active">
<label for="inactive" class="radio-inline">InActive</label><input type="radio" name="empstatus" value="InActive" id="inactive">
</c:when>
<c:when test="${emp.empstatus==false}">
<label for="inactive" class="radio-inline">InActive</label><input type="radio" name="empstatus" value="InActive" checked="checked" id="inactive">
<label for="active" class="radio-inline">Active</label><input type="radio" name="empstatus" value="Active" id="active">
</c:when>
</c:choose>
<br><br>

<input type="submit" class="btn btn-primary" value="UPDATE"> 

</form>
</div>


</body>
</html>