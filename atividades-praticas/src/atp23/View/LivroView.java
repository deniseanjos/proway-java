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
                System.out.println("========== CADASTRAR ==========");
                cadastrar(controller, sc);
                break;
                case 2:
                System.out.println("========== ATUALIZAR ==========");
                break;
                case 3:
                System.out.println("========== LISTAR ==========");
                listar(controller);
                break;
                case 4:
                System.out.println("========== DELETAR ==========");
                break;
                case 5:
                System.out.println("========== SAIR ==========");
                break;
            }
        }while(op != 0);

    }

    private static void cadastrar(LivroController controller, Scanner sc){
        Livro novoLivro = new Livro();
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
        //Livro livro = new Livro();
        System.out.print("Digite o ID do livro: ");
        String codigo = sc.nextLine();
        

    }

    private static void listar(LivroController controller){
        ArrayList<Livro> lista = controller.listar();
        for(Livro livro : lista){
            System.out.printf("\nID: %s\nTITULO: %s\nAUTOR: %s\nQTD. PAGINAS: %d\nEDITORA: %s\n\n", livro.getId(), livro.getNome(), livro.getAutor(), livro.getQtdPaginas(), livro.getEditora());
        }
    }
    
    private static int menu(Scanner sc){
        System.out.println("\t\t\t\t========== BASE VIRTUAL DE LIVROS ==========");
        System.out.println("Opções disponiveis:\n1 - CADASTRAR\t|\t2 - ATUALIZAR\t|\t3 - LISTAR\t|\t4 - DELETAR\t|\t5 - SAIR");
        System.out.print("Digite a opção desejada: ");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }
}
