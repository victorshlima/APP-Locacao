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
    <h2>AppLocacao</h2>
    <p>Locação de Automoveis</p>

    <h3>Classe: Locatario</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
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
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>descrição das condições do veículo, tipo e etc</td>
        </tr>
        <tr>
            <td>dataLocacao</td>
            <td>LocalDateTime</td>
            <td>Data de Locação</td>
        </tr>
        <tr>
            <td>dataLocacao</td>
            <td>LocalDateTime</td>
            <td>Data de Devolução</td>
        </tr>
        <tr>
            <td>Automovel</td>
            <td>Automovel</td>
            <td>Id do automóvel locado</td>
        </tr>
        </tbody>
    </table>
    <h3>Classe: Carro</h3>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
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
            <th>Descrição</th>
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
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>tipo</td>
            <td>String</td>
            <td>Tipo do caminhão</td>
        </tr>
        <tr>
            <td>capacidadeCarga</td>
            <td>int</td>
            <td>Capacidade máxima de carga do caminhão</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>