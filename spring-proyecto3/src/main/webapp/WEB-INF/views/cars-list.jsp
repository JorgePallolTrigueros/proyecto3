<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Smartphone List | Awesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
	
	<div class = "pt-5 container">
		
		<h1>Coches</h1>
		<hr/>
		
		<p>${NOTIFICATION}</p>
		
		<p>
			<a class = "btn btn-primary" href="${pageContext.request.contextPath}/cars/new">AÑADIR Coche</a>
			<a class = "btn btn-danger" href="${pageContext.request.contextPath}/cars/delete/all">BORRAR Coches</a>
			
		</p>
	
		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Modelo</th>
				<th>CC</th>
				<th>CV</th>
				<th>Plazas</th>
				<th>User</th>
				<th>Actions</th>
			</tr>
			
			<c:forEach items="${cars}" var="car">
			
				<tr>
					<td>${car.model}</td>
					<td>${car.cc}</td>
					<td>${car.cv}</td>
					<td>${car.numPassengers}</td>
					<td>${car.user.name}</td>
					
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/cars/${task.id}/view">Ver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/cars/${task.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/cars/${task.id}/delete">Borrar</a>
						 
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>