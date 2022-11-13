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
	  <h3>Pagamentos: ${listagem.size()}</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Mês</th>
	        <th>Ano</th>
	        <th>Descrição</th>
	        <th>Valor</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.mes}</td>
		        <td>${p.ano}</td>
		        <td>${p.descricao}</td>
		        <td>${p.valor}</td>
		        <td><a href="/pagamento/${p.idPagamento}/visualizar">Visualizar</a> <a href="/pagamento/${p.idPagamento}/excluir">Excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>
