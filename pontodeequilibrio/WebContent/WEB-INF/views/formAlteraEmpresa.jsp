<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de empresa</title>
</head>
<body>

	<form action="/pontodeequilibrio/entrada?" method="POST">
	nome: <input type="text" name="nome" value="${empresa.nome}"/>
		<input type="hidden" name="id" value="${empresa.id}"/>
		<input type="hidden" name="acao" value="AlteraEmpresa"/>
		
		
		<input type="submit"/>
	</form>
</body>
</html>	