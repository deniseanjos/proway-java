import java.util.ArrayList;
import java.util.Scanner;

public class LivroView {

    public static void main(String[] args) {

        LivroController controller = new LivroController();

        Scanner sc = new Scanner(System.in);
        int op;
        
        do{
            op = menu(sc);

            switch(op){
                case 1:
                System.out.println("\n========== CADASTRAR ==========\n");
                cadastrar(controller, sc);
                break;
                case 2:
                System.out.println("\n========== ATUALIZAR ==========\n");
                atualizar(controller, sc);
                break;
                case 3:
                System.out.println("\n========== LISTAR ==========\n");
                listar(controller);
                break;
                case 4:
                System.out.println("\n========== DELETAR ==========\n");
                deletar(controller, sc);
                break;
                case 5:
                System.out.println("\n\n========== SAIR ==========\n\n");
                System.out.println("Bye");
                break;
            }
        }while(op != 5);

    }

    private static void cadastrar(LivroController controller, Scanner sc){
        System.out.print("Digite o ID do livro: ");
        int id = Integer.parseInt(sc.nextLine());
        Livro novoLivro = new Livro(id);
        System.out.print("Digite o nome do autor: ");
        novoLivro.setAutor(sc.nextLine());
        System.out.print("Digite o nome do livro: ");
        novoLivro.setNome(sc.nextLine());
        System.out.print("Digite o número de páginas: ");
        novoLivro.setQtdPaginas(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite a editora: ");
        novoLivro.setEditora(sc.nextLine());
        controller.salvar(novoLivro);
    }

    private static void atualizar(LivroController controller, Scanner sc){
        System.out.print("Digite o ID do livro: ");
        int id = Integer.parseInt(sc.nextLine());
        Livro livro = new Livro(id);
        // System.out.print("Digite o ID do livro: ");
        // livro.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite o nome do autor: ");
        livro.setAutor(sc.nextLine());
        System.out.print("Digite o nome do livro: ");
        livro.setNome(sc.nextLine());
        System.out.print("Digite o número de páginas: ");
        livro.setQtdPaginas(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite a editora: ");
        livro.setEditora(sc.nextLine());
        controller.alterar(livro);
    }

    private static void listar(LivroController controller){
        ArrayList<Livro> lista = controller.listar();
        for(Livro livro : lista){
            System.out.printf("\nID: %s\nTITULO: %s\nAUTOR: %s\nQTD. PAGINAS: %d\nEDITORA: %s\n\n", livro.getId(), livro.getNome(), livro.getAutor(), livro.getQtdPaginas(), livro.getEditora());
        }
        if(lista.isEmpty()){
            System.out.println("Lista de livros está vazia.");
        }
    }

    private static void deletar(LivroController controller, Scanner sc){
        System.out.print("Digite o ID do livro: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Livro deletado com sucesso!");
        Livro livro = new Livro(id);
        controller.deletar(livro);
    }
    
    private static int menu(Scanner sc){
        System.out.println("\t\t\t\t========== BASE VIRTUAL DE LIVROS ==========");
        System.out.println("Opções disponiveis:\n1 - CADASTRAR\t|\t2 - ATUALIZAR\t|\t3 - LISTAR\t|\t4 - DELETAR\t|\t5 - SAIR");
        System.out.print("Digite a opção desejada: ");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }
}
