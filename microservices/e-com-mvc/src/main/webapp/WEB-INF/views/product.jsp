<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid p-5 bg-info text-white text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-4">
      <h3>Product Page</h3>
      
    </div>
    <div class="col-sm-4">

    </div>
  </div>
  <div class="row">
    <div class="col-sm-2">
      
    </div>
    <div class="col-sm-8">
      <table class="table table-striped table-bordered table-hover">
      	<thead>
      		<tr>
      			<th>Id</th><th>Name</th><th>Price</th>
      		</tr>
      	</thead>
      	<tbody>
      		<c:forEach var="p" items="${products }">
      			<tr>
      				<td>${p.id }</td>
      				<td>${p.name }</td>
      				<td>${p.price }</td>
      			</tr>
      		</c:forEach>	
      	</tbody>
      </table>
    </div>
    <div class="col-sm-2">
      
    </div>
</div>
</body>
</html>