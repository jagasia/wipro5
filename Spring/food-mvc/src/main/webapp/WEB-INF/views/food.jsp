<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container-fluid p-5 bg-info text-white text-center">
		<h1>My First Bootstrap Page</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>

	<div class="container mt-5">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<h3>Food Page</h3>
				<form method="post" action="/food/dml">
					Id: <input type="number" name="id" class="form-control" /> Name: <input
						type="text" name="name" class="form-control" /> Price: <input
						type="number" name="price" class="form-control" /> Category: <input
						type="text" name="category" class="form-control" /> <br /> <input
						type="submit" name="add" value="Add" class="btn btn-success" />&nbsp;
					<input type="submit" name="update" value="Update"
						class="btn btn-warning" />&nbsp; <input type="submit"
						name="delete" value="Delete" class="btn btn-danger" />&nbsp;
				</form>
			</div>
			<div class="col-sm-3"></div>
		</div>
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<table class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Price</th>
							<th>Category></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="f" items="${foods }">
							<tr>
								<td>${f.id }</td>
								<td>${f.name }</td>
								<td>${f.price }</td>
								<td>${f.category }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>