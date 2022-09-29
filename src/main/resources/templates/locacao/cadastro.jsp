<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Applocatario</title>
</head>
<body>

<div class="container mt-3">
    <h2> Cadstramento de locacao</h2>

    <nav th:fragment="menu/menu.jsp :: navbar"></nav>

    <form action="/locacao/incluir" method="post">
        <div class="mb-3 mt-3">
            <label for="descricao" class="form-label">descricao:</label>
            <input type="text" class="form-control" id="descricao" placeholder="Entre com seu Nome" name="descricao">
        </div>
        <div class="mb-3 mt-3">
            <label>locatario:</label>
            <select name="locatario" class="form-control" id="dropDownList">
                <option value="0">select locatario</option>
                <option th:each="locatario : ${locatarios}" th:value="${locatario.id}"
                        th:text="${locatario.nome}"></option>
            </select>
        </div>
        <h3>Classe: Automovel</h3>
        <table class="table table-dark table-striped">
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
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>

</body>
</html>