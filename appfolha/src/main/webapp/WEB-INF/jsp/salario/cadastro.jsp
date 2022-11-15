<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    
	<title>AppFolha</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Nova Folha Salário</h3>
	  <hr>
	  <form action="/salario/adicionar" method="post">
	    <div class="form-group row">
	    	<div class="col-xs-4">
	    	 <label for="ex2">Mês</label>
	         <input type="text" class="form-control" placeholder="Mês Referência" name="mes" maxlength="45">
	    	</div>
	    <div class="col-xs-4">
	    	 <label for="ex2">Ano</label>
	         <input type="text" class="form-control" placeholder="Ano Referência" name="ano" maxlength="45">
	    	</div>
	    </div>
	    
	     <div class="form-group row">
	    	<div class="col-xs-8">
	    	 <label>Descrição</label>
	         <input type="text" class="form-control"  placeholder="Entre com a descrição da folha a ser criada" name="descricao" id="cpf">
	    	</div>
	    </div>
	    <hr>
	    <div class="form-group row">
	    	<div class="col-xs-12" style="text-align: right;">
	    	 <button type="button" OnClick="history.go(-1);"  class="btn btn-default">Voltar</button>
	      	<button type="submit" class=" btn btn-primary">Adicionar</button>
	    	</div>
	    </div>
	    
	  </form>
     </div>
</body>
</html>