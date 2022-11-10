<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>AppFolha</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Funcionarios Cadastrados: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Ocupação</th>
	        <th>Cidade</th>
	        <th>Valor a receber</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.nome}</td>
		        <td>${p.ocupacao}</td>
		        <td>${p.endereco}</td>
		         <td>0</td>
		        <td><a href="/funcionario/${p.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>
