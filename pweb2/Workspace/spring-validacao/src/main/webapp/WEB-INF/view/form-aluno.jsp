<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulário de Cadastro de Aluno</title>
</head>
<body>
	<form:form action="salve" method="post" modelAttribute="aluno">
		Nome: <form:input path="nome"/><form:errors path="nome"/><br/>
		Matrícula: <form:input path="matricula"/><form:errors path="matricula"/><br/>
		Data: <form:input path="dataNascimento"/><form:errors path="dataNascimento"/><br/>
		Código do Curso: <form:input path="curso"/><form:errors path="curso"/><br/>
		CRE: <form:input path="cre"/><form:errors path="cre"/><br/>
		<input type="submit" value="Salvar"/>
	</form:form>
</body>
</html>