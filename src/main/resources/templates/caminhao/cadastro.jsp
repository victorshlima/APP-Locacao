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
    <nav class="navbar navbar-expand-sm bg-light navbar-light">
        <div class="container-fluid">

            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" href="/">Home</a>
                </li>
            </ul>
            <ul th:if="${user} != null" class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario/lista">Usuario</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/automovel/lista">automovel</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/caminhao/lista">caminhao</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/carro/lista">carro</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/moto/lista">moto</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/locacao/lista">locacao</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/locatario/lista">locatario</a>
                </li>
            </ul>

            <ul th:if="${user} == null" class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" href="/usuario">Signup</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/login">Login</a>
                </li>
            </ul>
            <ul th:if="${user} != null" class="nav nav-tabs">
                <li class="nav-item">
                    <a th:text="'Logout '+${user.nome}" class="nav-link" href="/logout">Logout</a>
                </li>
            </ul>
        </div>
    </nav>

    <div th:if="${mensagem} != null"   class="alert alert-info">
        <strong th:text="${mensagem}">Informação</strong>
    </div>


<form action="/caminhao/incluir" method="post">
    
    <div class="mb-3 mt-3">
        <label for="tipo" class="form-label">tipo:</label>
        <input type="text" class="form-control" id="tipo" placeholder="Entre com seu marca" name="tipo">
    </div>

    <div class="mb-3 mt-3">
        <label for="eixos" class="form-label">eixos:</label>
        <input type="text" class="form-control" id="eixos" placeholder="Entre com seu modelo" name="eixos">
    </div>

    <div class="mb-3 mt-3">
        <label for="capacidadeCarga" class="form-label">capacidadeCarga:</label>
        <input type="text" class="form-control" id="capacidadeCarga" placeholder="Entre com o Portas" name="capacidadeCarga">
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>

</form>
</div>

</body>
</html>