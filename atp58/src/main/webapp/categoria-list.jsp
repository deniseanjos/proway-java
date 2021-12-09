<%@ page import="java.util.ArrayList, com.prowayjava.atp58.models.Categoria" %>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias");
%>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/styles.css">
    <title>Lista de Categorias</title>
</head>

<body>
    <h1>Lista de Categorias</h1>

    <form action="/atp58-1/categoria/list" method="get">
        Filtrar: <input type="text" name="nome" id="nome">
        <input type="submit" value="Buscar">
    </form>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Categoria</th>
                <th>Descricao</th>
                <th>Opcoes</th>              
            </tr>
        </thead>
        <tbody>
        <%
        for(Categoria model : categorias){  
        %>
            <tr>
                <td><%= model.getId() %></td>
                <td><%= model.getNome() %></td>
                <td><%= model.getDescricao() %></td>
                <td>
                    <a href="/atp58-1/categoria/selecionar?id=<%= model.getId() %>">Alterar</a> | 
                    <a href="/atp58-1/categoria/deletar?id=<%= model.getId() %>">Deletar</a>
                </td>
            </tr>
        <%
        }
        %>
        </tbody>

    </table>
</body>

</html>