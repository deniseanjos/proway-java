import java.util.Scanner;

public class atividade1_cadastro {

    private static String usuario;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuario, produto, categoria;
        double valor;

        System.out.println("====== CADASTRO DE PRODUTOS ======\n");
        System.out.println("Seja bem vinde! Realize o cadastro informando os dados abaixo.\n");

        System.out.printf("Informe o nome do usuário: ");
        usuario = scanner.next();

        System.out.printf("Informe a descrição do produto: ");
        produto = scanner.next();

        System.out.printf("Informe a categoria do produto: ");
        categoria = scanner.next();

        System.out.printf("Informe o valor do produto (R$): ");
        valor = scanner.nextDouble();

        System.out.println("\n====== PRODUTO CADASTRADO ======\n");

        System.out.println("USUÁRIO\tPRODUTO\tCATEGORIA\tVALOR\n");
        System.out.printf("%s\t%s\t%s\t\t%.2f\t", usuario, produto, categoria, valor);

    }

}
