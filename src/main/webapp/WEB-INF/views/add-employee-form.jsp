<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Add Employee Form</title>
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
</head>
<body>

<h1>Add Employee Form</h1>
<hr>
<div class="col-xs-4">
<form action="employees" method="post">
<label for="usr">Name</label>
<input type="text" class="form-control"  id="usr" name="name">
<br>

<label for="email" >Email Id</label>
<input type="email" class="form-control" name="email" id="email">
<br>

<label for="dob">DOB</label>
<input type="date"  class="form-control" name="dob" id="dob">
<br>

<label for="age">Age</label>
<input type="number" class="form-control" name="age" readonly="readonly" id="age" onmouseover="calculateAge()">
<br>

<label for="salary" >Salary</label>
<input type="number"  class="form-control" name="salary" id="salary">
<br>

<div class="radio">
<label>Status</label>
<label for="active"class="radio-inline"><input type="radio" name="empstatus"  value="Active" id="active">ACTIVE</label>
<label for="inactive"class="radio-inline"><input type="radio" name="empstatus" value="InActive" id="inactive">IN-ACTIVE</label>
</div>
<br>

<input type="submit" class="btn btn-primary" value="Add Employee"> 

</form>
</div>


</body>
</html>