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

    <h3>Classe: Carro</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>marca</th>
            <th>modelo</th>
            <th>Portas</th>
            <th>cilindradas</th>
            <th>chassi</th>
            <th>placa</th>
            <th>lotacao</th>
        </tr>
        </thead>
    <tbody>
        <!--/*@thymesVar id="carroLista" type="java"*/-->
        <tr th:each="carro: ${carroLista}">
            <td th:text="${carro.id}"></td>
            <td th:text="${carro.marca}"></td>
            <td th:text="${carro.modelo}" ></td>
            <td th:text="${carro.portas}" ></td>
            <td th:text="${carro.cilindradas}" ></td>
            <td th:text="${carro.chassi}" ></td>
            <td th:text="${carro.placa}" ></td>
            <td th:text="${carro.lotacao}" ></td>
        </tr>

    </tbody>

    </table>
</div>
</body>
</html>