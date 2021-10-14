import java.util.Scanner;

public class LivroView {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        
        switch(op){
            case 1:
            System.out.println("========== CADASTRAR ==========");
            break;
            case 2:
            System.out.println("========== ATUALIZAR ==========");
            break;
            case 3:
            System.out.println("========== LISTAR ==========");
            break;
            case 4:
            System.out.println("========== DELETAR ==========");
            break;
            case 5:
            System.out.println("========== SAIR ==========");
            break;
        }
    }
    
}
