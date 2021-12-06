package atividadesdiversas;
import java.util.Scanner;

public class atividade4_while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao, clientesCadastrados = 0;
        String nomeCliente = "";
        String sobrenomeCliente = "";
        String cpfCliente = "";
        String rgCliente = "";
        boolean invalido = true;

        System.out.print("==== CADASTRO DE CLIENTES ====\n" +
                "Seja bem vinde! ");
        System.out.print("Escolha uma das opções\n" +
                "1 - CADASTRO\t|\t2 - LISTAR \t|\t3 - SAIR" +
                "\nOpção escolhida: ");

        do {

            opcao = sc.nextInt();

            while (opcao <= 0 || opcao > 3){
                System.out.print("Opção inválida. Favor digite novamente: ");
                opcao = sc.nextInt();
            }

            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("=== CADASTRO DE CLIENTE ===");
                    do {
                        System.out.print("Informe o nome do cliente: ");
                        nomeCliente = sc.nextLine();
                        if (nomeCliente.length() < 3) {
                            invalido = true;
                            System.out.print("O nome deve possuir no mínimo 3 caracteres. ");
                        } else {
                            invalido = false;
                        }
                    } while (invalido);

                    invalido = true;

                    do {
                        System.out.print("Informe o sobrenome do cliente: ");
                        sobrenomeCliente = sc.nextLine();
                        if (sobrenomeCliente.length() < 3) {
                            invalido = true;
                            System.out.print("O sobrenome deve possuir no mínimo 3 caracteres. ");
                        } else {
                            invalido = false;
                        }
                    } while (invalido);

                    invalido = true;

                    do {
                        System.out.print("Informe o CPF do cliente: ");
                        cpfCliente = sc.nextLine();
                        if (cpfCliente.length() < 11) {
                            invalido = true;
                            System.out.print("O CPF deve possuir no 11 caracteres. ");
                        } else {
                            invalido = false;
                        }
                    } while (invalido);

                    invalido = true;

                    do {
                        System.out.print("Informe o RG do cliente: ");
                        rgCliente = sc.nextLine();
                        if (rgCliente.length() < 4 || rgCliente.length() > 9) {
                            invalido = true;
                            System.out.print("O RG deve conter entre 4 e 9 caracteres. ");
                        } else {
                            invalido = false;
                        }
                    } while (invalido);

                    System.out.println("Cliente cadastrado com sucesso!");
                    clientesCadastrados++;

                    System.out.print("\nEscolha uma das opções para continuar: \n" +
                            "1 - CADASTRO\t|\t2 - LISTAR \t|\t3 - SAIR" +
                            "\nOpção escolhida: ");

                    break;
                case 2:

                    if(clientesCadastrados == 0){
                        System.out.println("Não há cliente cadastrado.");
                        System.out.print("\nEscolha uma das opções para continuar: \n" +
                                "1 - CADASTRO\t|\t2 - LISTAR \t|\t3 - SAIR" +
                                "\nOpção escolhida: ");

                    } else {
                        System.out.printf("=== CLIENTES CADASTRADOS ===\n" +
                                "NOME COMPLETO: %s %s\n" +
                                "CPF: %s\n" +
                                "RG: %s", nomeCliente,sobrenomeCliente,cpfCliente,rgCliente);

                        System.out.print("\nEscolha uma das opções para continuar: \n" +
                                "1 - CADASTRO\t|\t2 - LISTAR \t|\t3 - SAIR" +
                                "\nOpção escolhida: ");
                    }

                    break;
                case 3:
                    System.out.println("Agradecemos a visita.");
                    break;
            }

        } while (opcao != 3);

        System.out.println("Sistema finalizado.");

    }

}
