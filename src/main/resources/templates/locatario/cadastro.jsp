<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLocacao</title>
</head>
<body>

<div class="container mt-3">
<h2> Cadstramento de locatario</h2>

<nav th:fragment="menu/menu.jsp :: navbar"> </nav>

<form action="/locatario/incluir" method="post">
    <div class="mb-3 mt-3">
        <label for="Nome" class="form-label">Nome:</label>
        <input type="text" class="form-control" id="nome" placeholder="Entre com seu Nome" name="nome">
    </div>

    <div class="mb-3 mt-3">
        <label for="sobrenome" class="form-label">Cpf:</label>
        <input type="text" class="form-control" id="sobrenome" placeholder="Entre com seu sobrenome" name="sobrenome">
    </div>

    <div class="mb-3 mt-3">
        <label for="cpf" class="form-label">Cpf:</label>
        <input type="text" class="form-control" id="cpf" placeholder="Entre com seu cpf" name="cpf">
    </div>

    <div class="mb-3 mt-3">
        <label for="email" class="form-label">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Entre com seu e-mail" name="email">
    </div>
    <button type="submit" class="btn btn-primary">Castrar</button>
</form>
</div>

</body>
</html>