<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="/pontodeequilibrio/entrada?acao=Login" method="POST">
		
		Login: <input type="text" name="login">
		Senha: <input type="password" name="senha">
				<input type="submit"/>
	
	</form>
</body>
</html>