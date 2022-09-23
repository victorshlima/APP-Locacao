<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLocacao</title>
</head>
<body>

<div class="container mt-3">
<h2> Cadstramento de Caminhao</h2>

<nav th:fragment="menu/menu.jsp :: navbar"> </nav>

<form action="/caminhao/incluir" method="post">
    
    <div class="mb-3 mt-3">
        <label for="id" class="form-label">id:</label>
        <input type="text" class="form-control" id="id" placeholder="Entre com o id" name="id">
    </div>

    <div class="mb-3 mt-3">
        <label for="marca" class="form-label">marca:</label>
        <input type="text" class="form-control" id="marca" placeholder="Entre com seu marca" name="marca">
    </div>

    <div class="mb-3 mt-3">
        <label for="modelo" class="form-label">modelo:</label>
        <input type="text" class="form-control" id="modelo" placeholder="Entre com seu modelo" name="modelo">
    </div>

    <div class="mb-3 mt-3">
        <label for="Portas" class="form-label">Portas:</label>
        <input type="text" class="form-control" id="Portas" placeholder="Entre com o Portas" name="Portas">
    </div>

    <div class="mb-3 mt-3">
        <label for="cilindradas" class="form-label">cilindradas:</label>
        <input type="text" class="form-control" id="cilindradas" placeholder="Entre com seu cilindradas" name="cilindradas">
    </div>

    <div class="mb-3 mt-3">
        <label for="chassi" class="form-label">chassi:</label>
        <input type="text" class="form-control" id="chassi" placeholder="Entre com seu chassi" name="chassi">
    </div>

    <div class="mb-3 mt-3">
        <label for="placa" class="form-label">placa:</label>
        <input type="text" class="form-control" id="placa" placeholder="Entre com seu placa" name="placa">
    </div>

    <div class="mb-3 mt-3">
        <label for="lotacao" class="form-label">lotacao:</label>
        <input type="text" class="form-control" id="lotacao" placeholder="Entre com seu lotacao" name="lotacao">
    </div>


    <button type="submit" class="btn btn-primary">Cadastrar</button>

</form>
</div>

</body>
</html>