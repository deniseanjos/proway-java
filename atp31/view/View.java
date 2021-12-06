package view;

import java.util.Scanner;

import controller.CategoriaController;
import controller.ProdutoController;
import model.Categoria;
import model.Produto;

public class View {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoController pController = new ProdutoController();
        CategoriaController cController = new CategoriaController();

        char continua;
        int op;

        do {

            visualizar_menu_principal();
            op = selecionar_menu("Digite a opção desejada: ", 1, 5, sc);
            executa_menu_principal(op, pController, cController, sc);
            if (op != 5) {
                continua = continuar_menu("\nDeseja continuar? (S/N): ", 'S', 'N', sc);
            } else {
                continua = 'N';
            }

        } while (continua == 'S');

    }

    private static void visualizar_menu_principal() {
        System.out.println("\t\t========= SISTEMA DE CADASTRO =========");
        System.out.println("1 - Cadastrar\t2 - Atualizar\t3 - Listar\t4 - Deletar\t5 - Sair");
    }

    private static void visualizar_menu_secundario(String operacao) {
        System.out.printf("\n\tEscolha uma das opções para %s: ", operacao);
        System.out.println("\n\t1 - Produto\t|\t2 - Categoria");
    }

    private static int selecionar_menu(String msg, int valorInicial, int valorFinal, Scanner sc) {
        int op = 0;

        boolean ok = true;

        do {
            try {
                System.out.print(msg);
                op = Integer.parseInt(sc.nextLine());
                while (op < valorInicial || op > valorFinal) {
                    System.out.print("Opção inválida. Digite novamente: ");
                    op = Integer.parseInt(sc.nextLine());
                }
                ok = true;
            } catch (Exception e) {
                System.out.printf("\nError: %s. Este campo aceita apenas números inteiros. Digite novamente.\n",
                        e.getMessage());
                ok = false;
            }
        } while (!ok);

        return op;
    }

    private static void executa_menu_principal(int op, ProdutoController pController, CategoriaController cController,
            Scanner sc) {
        int op2 = 0;

        switch (op) {
        case 1:
            visualizar_menu_secundario("CADASTRAR");
            op2 = selecionar_menu("\tDigite aqui: ", 1, 2, sc);
            if (op2 == 1) {
                cadastrar_produto(pController, cController, sc);
            } else {
                cadastrar_categoria(cController, sc);
            }
            break;
        case 2:
            visualizar_menu_secundario("ATUALIZAR");
            op2 = selecionar_menu("\tDigite aqui: ", 1, 2, sc);
            if (op2 == 1) {
                atualizar_produto(pController, cController, sc);
            } else {
                atualizar_categoria(cController, sc);
            }
            break;
        case 3:
            visualizar_menu_secundario("LISTAR");
            op2 = selecionar_menu("\tDigite aqui: ", 1, 2, sc);
            if (op2 == 1) {
                listar_produtos(pController);
            } else {
                listar_categorias(cController);
            }
            break;
        case 4:
            visualizar_menu_secundario("DELETAR");
            op2 = selecionar_menu("\tDigite aqui: ", 1, 2, sc);
            if (op2 == 1) {
                deletar_produto(pController, sc);
            } else {
                deletar_categoria(cController, sc);
            }
            break;
        case 5:
            System.out.println("Saindo...");
            break;
        }
    }

    private static void cadastrar_produto(ProdutoController pController, CategoriaController cController, Scanner sc) {
        Categoria categoria = new Categoria();
        Produto produto = new Produto();

        boolean valido;

        do {
            try {
                System.out.print("\nDigite o ID do produto: ");
                produto.id = Integer.parseInt(sc.nextLine());
                while (produto.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    produto.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        System.out.print("\nDigite o nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.print("\nDigite a descrição do produto: ");
        produto.descricao = sc.nextLine();

        do {
            try {
                System.out.print("\nDigite o valor do produto: ");
                produto.valor = Double.parseDouble(sc.nextLine());
                while (produto.valor <= 0) {
                    System.out.print("\nValor inválido. Necessário ser maior que 0. Digite novamente: ");
                    produto.valor = Double.parseDouble(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Formato invalido. Este campo não aceita letras, valores negativos ou igual a 0 e virgula (,). Indique as casas decimais utilizando ponto (.).");
                valido = false;
            }
        } while (!valido);

        do {
            try {
                System.out.print("\nDigite o ID da categoria: ");
                categoria.id = Integer.parseInt(sc.nextLine());
                while (categoria.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    categoria.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        System.out.print("\nDigite o nome da categoria: ");
        categoria.categoria = sc.nextLine();

        produto.categoria = categoria;

        if(pController.verifica(produto)){
            System.out.println("Este produto já foi cadastrado anteriormente. Se necessário, realize atualização.");
        } else {
            pController.create(produto);
            cController.create(categoria);
            System.out.println("Produto criado com sucesso!");
        }

    }

    private static void cadastrar_categoria(CategoriaController cController, Scanner sc){
        Categoria categoria = new Categoria();
        boolean valido;

        do {
            try {
                System.out.print("\nDigite o ID da categoria: ");
                categoria.id = Integer.parseInt(sc.nextLine());
                while (categoria.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    categoria.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        System.out.print("\nDigite o nome da categoria: ");
        categoria.categoria = sc.nextLine();

        if(cController.verifica(categoria)){
            System.out.println("Categora já criada anteriormente. Se necessário, atualize as informações.");
        } else {
            cController.create(categoria);
            System.out.println("Categoria criado com sucesso!");
        }
    }

    private static void atualizar_produto(ProdutoController pController, CategoriaController cController, Scanner sc){
        Categoria categoria = new Categoria();
        Produto produto = new Produto();

        boolean valido;

        do {
            try {
                System.out.print("\nDigite o ID do produto: ");
                produto.id = Integer.parseInt(sc.nextLine());
                while (produto.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    produto.id = Integer.parseInt(sc.nextLine());
                }
                while (!pController.verifica(produto)) {
                    System.out.print("\nID de Produto não localizado. Digite novamente: ");
                    produto.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        System.out.print("\nDigite o nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.print("\nDigite a descrição do produto: ");
        produto.descricao = sc.nextLine();

        do {
            try {
                System.out.print("\nDigite o valor do produto: ");
                produto.valor = Double.parseDouble(sc.nextLine());
                while (produto.valor <= 0) {
                    System.out.print("\nValor inválido. Necessário ser maior que 0. Digite novamente: ");
                    produto.valor = Double.parseDouble(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Formato invalido. Este campo não aceita letras, valores negativos ou igual a 0 e virgula (,). Indique as casas decimais utilizando ponto (.).");
                valido = false;
            }
        } while (!valido);

        do {
            try {
                System.out.print("\nDigite o ID da categoria: ");
                categoria.id = Integer.parseInt(sc.nextLine());
                while (categoria.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    categoria.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        System.out.print("\nDigite o nome da categoria: ");
        categoria.categoria = sc.nextLine();

        produto.categoria = categoria;

        if(pController.verifica(produto)){
            pController.update(produto);
            System.out.println("Produto atualizado com sucesso!");
            if(cController.verifica(categoria)){
                cController.update(categoria);
            } else {
                cController.create(categoria);
            }
        } else {
            System.out.println("Produto não localizado.");
        }
    }

    private static void atualizar_categoria(CategoriaController cController, Scanner sc){
        Categoria categoria = new Categoria();
        boolean valido;

        do {
            try {
                System.out.print("\nDigite o ID da categoria: ");
                categoria.id = Integer.parseInt(sc.nextLine());
                while (categoria.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    categoria.id = Integer.parseInt(sc.nextLine());
                }
                while (!cController.verifica(categoria)){
                    System.out.print("\nCategoria não localizada. Digite novamente: ");
                    categoria.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        System.out.print("\nDigite o nome da categoria: ");
        categoria.categoria = sc.nextLine();

        if(cController.verifica(categoria)){
            cController.update(categoria);
            System.out.println("Categora atualizada com sucesso!");
        } else {
            System.out.println("Categoria não localizada!");
        }
    }


    private static void listar_produtos(ProdutoController pController) {
        for(Produto p : pController.read()){
            System.out.println(p);
        }
    }

    private static void listar_categorias(CategoriaController cController){
        for(Categoria c : cController.read()){
            System.out.println(c);
        }
    }

    private static void deletar_produto(ProdutoController pController, Scanner sc){
        Produto produto = new Produto();

        boolean valido;

        do {
            try {
                System.out.print("\nDigite o ID do produto a ser removido: ");
                produto.id = Integer.parseInt(sc.nextLine());
                while (produto.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    produto.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);

        if (pController.verifica(produto)) {
            pController.delete(produto);
            System.out.println("Produto deletado com sucesso!");
        } else {
            System.out.println("Produto não localizado.");
        }

    }

    private static void deletar_categoria(CategoriaController cController, Scanner sc){
        Categoria categoria = new Categoria();
        boolean valido;

        do {
            try {
                System.out.print("\nDigite o ID da categoria: ");
                categoria.id = Integer.parseInt(sc.nextLine());
                while (categoria.id <= 0) {
                    System.out.print("\nID inválido. Precisa ser maior que 0. Digite novamente: ");
                    categoria.id = Integer.parseInt(sc.nextLine());
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Este campo aceita apenas números inteiros. Digite novamente.");
                valido = false;
            }
        } while (!valido);


        if(cController.verifica(categoria)){
            cController.delete(categoria);
            System.out.println("Categora deletada com sucesso!");
        } else {
            System.out.println("Categoria não localizada!");
        }

    }

    private static char continuar_menu(String mensagem, char positivo, char negativo, Scanner sc) {
        System.out.println(mensagem);
        char entrada = 'T';
        try {
            entrada = sc.nextLine().toUpperCase().charAt(0);
            while (entrada != positivo && entrada != negativo) {
                System.out.printf("Opção inválida. Digite uma das opções válidas (%s para SIM ou %s para NÃO): ",
                        positivo, negativo);
                entrada = sc.nextLine().toUpperCase().charAt(0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return entrada;
    }
}
