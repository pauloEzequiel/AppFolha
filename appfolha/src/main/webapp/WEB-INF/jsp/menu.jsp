<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AppPedido</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
       <c:if test="${not empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="/funcionario/lista">Funcion�rio</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/pagamento/lista">Pagamentos</a>
	      </li>
	      <li class="class=" nav-item dropdown">
	        <a class="dropdown-toggle" href="/folhaPagamento/lista"	data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Folha Pagamento <span class="caret"></span></a>
					<ul class="dropdown-menu">
					   
						<li><a class="nav-link" href="/salario/lista">Sal�rio</a></li>
						<li><a class="nav-link" href="/beneficio/lista">Benef�cio</a></li>
						<li><a class="nav-link" href="/devolucao/lista">Devolu��o</a></li>
						<li><a class="nav-link" href="/folhaPagamento/lista">Todas</a></li>
					</ul>
	      </li>
	   </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     <c:if test="${empty user}">
      	<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>      
	  	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	 </c:if>
     <c:if test="${not empty user}">
       <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
     </c:if>
    </ul>
  </div>
</nav>