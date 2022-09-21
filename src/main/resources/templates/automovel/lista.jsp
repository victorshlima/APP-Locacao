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


    <h3>Classe: Automovel</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>marca</th>
            <th>modelo</th>
        </tr>
        </thead>
        <tbody>
        <tr th:each="auto: ${listagem}">
            <td th:text="${auto.id}"></td>
            <td th:text="${auto.marca}"></td>
            <td th:text="${auto.modelo}" ></td>
            <td>
                <a th:href="@{/auto/{id}/excluir(id=${auto.id})}">excluir</a>
            </td>
        </tr>
        </tr>

        </tbody>
    </table>
</div>
</body>
</html>