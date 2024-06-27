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
  <h1>Wipro Batch Members site</h1>
  <p>We have done ecom portal!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-4">
      <h3>Sales Page</h3>
      <form action="/sales/customer">
      	<select name="id">
      		<c:forEach var="c" items="${customers }">
      			<option value="${c.id }">${c.name }</option>
      		</c:forEach>
      	</select>
      	<input type="submit" value="View Sales By Customer" class="btn btn-info" />
      </form>     
      
    </div>
    <div class="col-sm-4">

    </div>
  </div>
  <div class="row">
    <div class="col-sm-2">
      
    </div>
    <div class="col-sm-8">
    <h2>Sales done by customer</h2><h1>${customer.name }</h1>
      <table>
      	<thead class="table table-bordered table-striped table-hover">
      		<tr><th>Id</th><th>Date of Sales</th><th>Product Name</th><th>Quantity</th><th>Total</th>
      	</thead>
      	<tbody>
      	<c:forEach var="s" items="${customer.sales }">
      			<tr>
      				<td>${s.id }</td>
      				<td>${s.dateOfSales }</td>
      				<td>${s.product.name }</td>
      				<td>${s.quantity }</td>
      				<td>
      				${s.product.price * s.quantity }
      				</td>
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