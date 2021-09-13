import java.util.Scanner;

public class atividade1_cadastro {

    private static String usuario;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String descricao, produto, categoria;
        double valor;

        System.out.println("====== CADASTRO DE PRODUTOS ======\n");
        System.out.println("Seja bem vinde! Realize o cadastro informando os dados abaixo.\n");

        System.out.printf("Informe o nome do produto: ");
        produto = scanner.next();

        System.out.printf("Informe a descrição do produto: ");
        descricao = scanner.next();

        System.out.printf("Informe a categoria do produto: ");
        categoria = scanner.next();

        System.out.printf("Informe o valor do produto (R$): ");
        valor = scanner.nextDouble();

        System.out.println("\n====== PRODUTO CADASTRADO ======\n");

        System.out.println("PRODUTO\t\tDESCRICAO\t\tCATEGORIA\t\tVALOR\n");
        System.out.printf("%s\t\t%s\t\t%s\t\t%.2f", produto, descricao, categoria, valor);

    }

}
