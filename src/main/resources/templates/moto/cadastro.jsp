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

<form action="/moto/incluir" method="post">
    <div class="mb-3 mt-3">
        <label for="peso" class="form-label">Peso:</label>
        <input type="text" class="form-control" id="peso" placeholder="Entre com o peso" name="peso">
    </div>

    <div class="mb-3 mt-3">
        <label for="ano" class="form-label">Ano:</label>
        <input type="text" class="form-control" id="ano" placeholder="Entre com seu ano" name="ano">
    </div>

    <div class="mb-3 mt-3">
        <label for="tipoRoda" class="form-label">TipoRoda:</label>
        <input type="text" class="form-control" id="tipoRoda" placeholder="Entre com seu tipoRoda" name="tipoRoda">
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</div>

</body>
</html>