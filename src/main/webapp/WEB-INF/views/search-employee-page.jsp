<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Search Page</title>
</head>
<body>
<jsp:include page="homepage.jsp"></jsp:include>
	<h1>Search Employee</h1>
	<hr>
	<div class="col-xs-4">
		<form action="search-emp">
			<label  for="usr">Employee Id</label>
		    <input type="number" class="form-control" name="id" id="usr"> <br>
		    
		    
			<input type="submit"class="btn btn-primary" value="SEARCH">


		</form>
	</div>

</body>
</html>