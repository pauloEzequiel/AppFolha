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
    
    <script>
    $( "#cpf" ).keypress(function() {
        $(this).mask('000.000.000-00');
    });
    </script>

	<title>AppFolha</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Novo Funcion�rio</h3>
	  <hr>
	  <form action="/funcionario/adicionar" method="post">
	    <div class="form-group row">
	    	<div class="col-xs-8">
	    	 <label for="ex2">Nome</label>
	         <input type="text" class="form-control" id="ex2" placeholder="Entre com o nome do funcionario" name="nome" maxlength="45">
	    	</div>
	    </div>
	    
	     <div class="form-group row">
	    	<div class="col-xs-8">
	    	 <label>CPF</label>
	         <input type="text" class="form-control" maxlength="14" placeholder="Entre com o CPF do funcionario" name="CPF" id="cpf">
	    	</div>
	    </div>
	    
	    <div class="form-group row">
	    	<div class="col-xs-8">
	    	 <label>Ocupa��o</label>
	      	 <input type="text" class="form-control" placeholder="Entre com a ocupa��o do funcionario" name="ocupacao">
	    	</div>
	    </div>
	    
	    <div class="form-group row">
	    	<div class="col-xs-8">
	    	 <label>Endereco</label>
	      	<input type="text" class="form-control" placeholder="Entre com o endere�o do funcionario" name="endereco">
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