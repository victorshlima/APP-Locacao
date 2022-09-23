<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppEmprestimo</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
    <div class="container-fluid">
        <ul class="nav nav-tabs">
            <li class="nav-item">
                <a class="nav-link active" href="/">Home</a>
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
                <a class="nav-link" href="/locacao/lista">locacao</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/locatario/lista">locatario</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-3">


    <h4>
        <td>
            <a th:href="@{/usuario}">novo</a>
        </td>
    </h4>

    <h3>Usuario: Usuario</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Email</th>
            <th>Senha</th>
            <th>excluir</th>
        </tr>
        </thead>
    <tbody>
        <!--/*@thymesVar id="carroLista" type="java"*/-->
        <tr th:each="c: ${usuarioLista}">
            <td th:text="${c.nome}"></td>
            <td th:text="${c.email}"></td>
            <td th:text="${c.senha}" ></td>
            <td>
                <a th:href="@{/usuario/{email}/excluir(email=${c.email})}">excluir</a>
            </td>
        </tr>
    </tbody>
</table>
</div>
</body>
</html>