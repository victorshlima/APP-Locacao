<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
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

    <h3>Classe: Locacao</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>ID Automovel</th>
            <th>Descricao</th>
            <th>DataLocacao</th>
            <th>Data Devolucao</th>
            <th>web</th>
            <th>locatario</th>
            <th>Quantidade Automoveis</th>
            <th>excluir</th>
        </tr>
        </thead>
    <tbody>
        <!--/*@thymesVar id="carroLista" type="java"*/-->
        <tr th:each="locacao: ${locacaoLista}">
            <td th:text="${locacao.id}"></td>
            <td th:text="${locacao.descricao}"></td>
            <td th:text="${locacao.dataLocacao}" ></td>
            <td th:text="${locacao.dataDevolucao}" ></td>
            <td th:text="${locacao.web}" ></td>
            <td th:text="${locacao.locatario.nome}" ></td>
            <td th:text="${locacao.automoveis.size()}" ></td>
            <td>
                <a th:href="@{/locacao/{id}/excluir(id=${locacao.id})}">excluir</a>
            </td>
        </tr>

    </tbody>

    </table>
</div>
</body>
</html>