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
                <a class="nav-link" href="/automovel/lista">automovel</a>
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
            <a th:href="@{/caminhao}">novo</a>
        </td>
    </h4>

    <h3>Classe: Caminhão</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>eixos</th>
            <th>capacidadeCarga</th>
            <th>acao</th>
        </tr>
        </thead>
        <tbody>

        <tr th:each="cm: ${listagem}">
            <td th:text="${cm.id}"></td>
            <td th:text="${cm.eixos}"></td>
            <td th:text="${cm.capacidadeCarga}" ></td>
            <td>
                <a th:href="@{/caminhao/{id}/excluir(id=${cm.id})}">excluir</a>
            </td>
        </tr>

        </tbody>
    </table>
</div>
</body>
</html>