<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de empresas</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"/>

	Usuarui logado:${usuarioLogado.login}
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
				
				<li>${empresa.nome}
					<a href="/pontodeequilibrio/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remove</a>
					<a href="/pontodeequilibrio/entrada?acao=MostraEmpresa&id=${empresa.id}">Edita</a>
					
				</li>
		
		</c:forEach>
	
	</ul>

	

</body>
</html>