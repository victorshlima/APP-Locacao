<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLocacao</title>
</head>
<body>
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


<div class="container mt-3">
<h2> Cadstramento de locatario</h2>

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
    <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</div>

</body>
</html>