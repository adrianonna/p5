<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página Principal da Aplicação</title>

<c:if test="${not empty livro}">
<p>${livro.titulo} cadastrado com sucesso!</p>
</c:if>

<%-- <ul>
<c:forEach var="livroItem" items="${livros}">
<li>[${livroItem.id}] ${livroItem.titulo}</li>
</c:forEach>
</ul> --%>

<table>
	<tr>
		<th>Id</th>
		<th>Título</th>
		<th>Autor</th>
	</tr>	
	
	<c:forEach var="livroItem" items="${livros}">
	<tr style="text-align: center">
		<td><a href="${pageContext.request.contextPath}/livros/${livroItem.id}">${livroItem.id}</a></td>
		<td>${livroItem.titulo}</td>
		<td>${livroItem.autor}</td>
	</tr>
	</c:forEach>
</table>


</head>
<body>

</body>
</html>