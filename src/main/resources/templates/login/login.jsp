<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLocacao</title>
</head>
<body>



<div class="container mt-3">
    <nav th:fragment="menu/menu.jsp :: navbar"> </nav>

    <h2>AppLocacao</h2>
    <p>Loca��o de Automoveis</p>

    <h3>Classe: Locatario</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do locatario</td>
        </tr>
        <tr>
            <td>sobrenome</td>
            <td>String</td>
            <td>Sobrenome do locatario </td>
        </tr>
        <tr>
            <td>cpf</td>
            <td>String</td>
            <td>CPF do locatario verificado</td>
        </tr>
        <tr>
            <td>email</td>
            <td>String</td>
            <td>Email do locatario verificado</td>
        </tr>
        </tbody>
    </table>
    <h3>Classe: Locacao</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>descri��o das condi��es do ve�culo, tipo e etc</td>
        </tr>
        <tr>
            <td>dataLocacao</td>
            <td>LocalDateTime</td>
            <td>Data de Loca��o</td>
        </tr>
        <tr>
            <td>dataLocacao</td>
            <td>LocalDateTime</td>
            <td>Data de Devolu��o</td>
        </tr>
        <tr>
            <td>Automovel</td>
            <td>Automovel</td>
            <td>Id do autom�vel locado</td>
        </tr>
        </tbody>
    </table>
    <h3>Classe: Carro</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>portas</td>
            <td>int</td>
            <td>Quantas portas o carro possui</td>
        </tr>
        </tbody>
    </table>
    <h3>Classe: Moto</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <h3>Classe: Caminhao</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>tipo</td>
            <td>String</td>
            <td>Tipo do caminh�o</td>
        </tr>
        <tr>
            <td>capacidadeCarga</td>
            <td>int</td>
            <td>Capacidade m�xima de carga do caminh�o</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>