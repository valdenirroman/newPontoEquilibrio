<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculo Ponto De Equilibrio</title>
</head>
<body>

	<form action="/pontodeequilibrio/entrada?acao=CalculoPontoDeEquilibrio" method="POST">
		Empresa: <input type="text" name="nome">
		Custos: <input type="text" name="custos">
		Margem De Contribuição: <input type="text" name="margemContribuicao">
		
		<input type="submit" />
	
	</form>

</body>
</html>