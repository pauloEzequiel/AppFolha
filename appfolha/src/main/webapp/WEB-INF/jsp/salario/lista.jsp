<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Lista Funcionario</title>
</head>
<body>
    <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link" href="/pagamento/lista">Pagamentos</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/funcionario/lista">Funcion�rio</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/folhaPagamento/lista">Folha Pagamento</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/salario/lista">Sal�rio</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/beneficio/lista">Benef�cio</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/devolucao/lista">Devolu��o</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<div class="container mt-3">
	  <h3>Funcionarios Cadastrados: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Ocupa��o</th>
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
