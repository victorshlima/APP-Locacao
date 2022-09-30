<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Applocatario</title>
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
    <h2> Cadstramento de locacao</h2>

    <nav th:fragment="menu/menu.jsp :: navbar"></nav>

    <form action="/locacao/incluir" method="post">
        <div class="mb-3 mt-3">
            <label for="descricao" class="form-label">descricao:</label>
            <input type="text" class="form-control" id="descricao" placeholder="Entre com seu Nome" name="descricao">
        </div>
        <div th:if="${locatarios} != null"  class="mb-3 mt-3">
            <label>locatario:</label>
            <select name="locatario" class="form-control" id="dropDownList">
                <option value="0">select locatario</option>
                <option name="locatario" th:each="locatario : ${locatarios}" th:value="${locatario.id}"
                        th:text="${locatario.nome}"></option>
            </select>
        </div>
        <div th:if="${locatarios} == null"  class="mb-3 mt-3">
            <label>Não existem locatarios cadastrados</label>
        </div>
        <h3>Classe: Automovel</h3>
        <table th:if="${automoveis} != null"  class="table table-dark table-striped">
            <thead>
            </thead>
            <tbody>
            <tr th:each="auto: ${automoveis}">
                <div>
                    <label><input type="checkbox" name="automoveis" value="" th:value="${auto.id}" th:text="${auto.modelo}"></label>
                </div>
            </tr>
            </tr>
            </tbody>
        </table>
        <div th:if="${automoveis} == null"  class="mb-3 mt-3">
            <label>Não existem automoveis cadastrados</label>
        </div>
        <button th:disabled="${locatarios == null || automoveis == null }" type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>