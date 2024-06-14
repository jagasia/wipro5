<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-4">
      <h3>Product Page</h3>
      <a href="/product">Product Page</a>
      <form:form method="post" action="/product/dml" modelAttribute="product">
      	Id:			<form:input type="number" path="id" class="form-control" />
      	Name:		<form:input type="text" path="name" class="form-control" />
      	Category:	<form:input type="text" path="category" class="form-control" />
      	Price:		<form:input type="number" path="price" class="form-control" />
      	<br/>
      	<input type="submit" name="add" value="Add" class="btn btn-success" />&nbsp;
      	<input type="submit" name="update" value="Update" class="btn btn-warning" />&nbsp;
      	<input type="submit" name="delete" value="Delete" class="btn btn-danger" />&nbsp;
      	<br/>
      </form:form>
    </div>
    <div class="col-sm-4">
      
    </div>
  </div>
  <hr/><hr/>
  <div class="row">
  	<div class="col-sm-2">
  	</div>
  	<div class="col-sm-8">
  		<table class="table table-bordered table-striped table-hover">
  			<thead>
  				<tr>
  					<th>Id</th><th>Name</th><th>Category</th><th>Price</th><th></th>
  				</tr>
  			</thead>
  			<tbody>
  				<c:forEach var="p" items="${products }">
  					<tr>
  						<td>${p.id }</td>
  						<td>${p.name }</td>
  						<td>${p.category }</td>
  						<td>${p.price }</td>
  						<td><a href="/product/select?id=${p.id }">Select</a></td>
  					</tr>
  				</c:forEach>	
  			</tbody>
  		</table>
  	</div>
  	<div class="col-sm-2">
  	</div>
  </div>
</div>
</body>
</html>