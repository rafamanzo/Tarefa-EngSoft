<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de carros</title>
</head>
<body>
	<div class="header">
		<h1>Lista</h1>
	</div>
	
	<div class="body">
		<p><a href="../">Home</a></p>
		<table>
			<c:forEach items="${carros.lista}" var="carro" varStatus="status">
				<tr>
					<td>${carro.marca}</td>
					<td>${carro.modelo}</td>
					<td>${carro.cor}</td>
					<td>${carro.ano}</td>
					<td>
						<a href="remova/${status.index}">Excluir</a>
						<a href="edicao/${status.index}">Editar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<div class="rodape">
		<p class="">2011 - Rafael Reggiani Manzo</p>
	</div>
</body>
</html>