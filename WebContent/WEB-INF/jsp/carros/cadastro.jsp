<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de carros</title>
<link rel="stylesheet" href="../css/geral.css" type="text/css" />
</head>
<body>
	<div class="cabecalho">
		<h1>Cadastro</h1>
	</div>
	
	<div class="corpo">
		<p><a href="../">Home</a></p>
		<form action="salve">
		<table border="0">
			<tr>
				<td>Marca</td>
				<td><input name="carro.marca" type="text"></input></td>
			</tr>
			<tr>
				<td>Modelo</td>
				<td><input name="carro.modelo" type="text"></input></td>
			</tr>
			<tr>
				<td>Cor</td>
				<td><input name="carro.cor" type="text"></input></td>
			</tr>
			<tr>
				<td>Ano</td>
				<td><input name="carro.ano" type="text"></input></td>
			</tr>
			<tr><td colspan="2" align="center"><input type="submit"/></td></tr>
		</table>
		</form>
	</div>
	
	<div class="rodape">
		<p class="">2011 - Rafael Reggiani Manzo</p>
	</div>
</body>
</html>