<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Produto - Cadastro</title>
</head>
    <body>
        <h1>Cadastro de Produto</h1>
        <form action="/atp57-1/produto" method="post">
            Nome: <input type="text" name="nome" id="nome"> <br />
            Descricao: <input type="text" name="descricao" id="descricao"> <br />
            Valor (R$): <input type="number" name="preco" id="preco" min="0.00" step="0.01"> <br />
            ID da Categoria: <input type="number" name="categoria_id" id="categoria_id"> <br />
            <input type="submit" value="Salvar">
        </form>
    </body>
</html>