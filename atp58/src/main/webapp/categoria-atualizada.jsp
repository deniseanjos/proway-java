<%-- Scriplet --%>
<%
    int id = (int)request.getAttribute("id");
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
        <h1>Categoria atualizada com sucesso!</h1>
        <h4>ID da categoria atualizada: <%= id %> </h4>
        <br />
        <a href="/atp58-1/categoria/list">Ir para lista de Categorias</a>
    </body>
</html>