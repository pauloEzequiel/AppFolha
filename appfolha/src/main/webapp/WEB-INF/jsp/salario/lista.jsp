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
	  <h3>Folha Sal?rio</h3>
	  <hr>
	  <h4 style="text-align: right;"><a href="/salario/cadastro">Nova Folha</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Mes</th>
	        <th>Ano</th>
	        <th>Descri??o</th>
	        <th>Qtd Pagamento</th>
	        <th>Valor Folha</th>
	        <th>A??es</th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.mes}</td>
		        <td>${p.ano}</td>
		        <td>${p.descricao}</td>
		        <td>${p.obterQtdPagamentos()}</td>
		        <td>${p.getTotalValor()}</td>
		        <td><a href="/salario/${p.id}/visualizar">Visualizar</a> <a href="/salario/${p.id}/excluir">Excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>
