<%@ page import="com.prowayjava.atp58.models.Categoria" %>

<%
    Categoria model = (Categoria)request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Atualizar Categoria</title>
</head>
    <body>
        <h1>Categoria - Alterar:</h1>
        <form action="/atp58-1/categoria/alterar" method="post">
            ID: <input type="number" name="id" id="id" value="<%= model.getId() %>"> <br />
            Nome: <input type="text" name="nome" id ="nome" value="<%= model.getNome() %>"> <br />
            Descricao: <input type="text" name="descricao" id="descricao" value="<%= model.getDescricao() %>"> <br />
            <input type= "submit" value= "Salvar Alteracao">
        </form>
    </body>
</html>