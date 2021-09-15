import java.util.Scanner;

public class atividade3_switchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("=== CADASTRO DE FILMES, SERIES E DOCUMENTARIOS ====\nEscolha de acordo com menu para cadastro:\n1 - FILME\t|\t2 - SÉRIE\t|\t3 - DOCUMENTARIO\nDigite aqui: ");
        int menu = sc.nextInt();
        sc.nextLine();

        switch (menu){
            case 1:
                System.out.print("Informe o nome do filme: ");
                String nomeFilme = sc.nextLine();
                System.out.print("Informe a descrição do filme: ");
                String descricaoFilme = sc.nextLine();
                System.out.print("Informe o genero do filme: ");
                String generoFime = sc.nextLine();
                System.out.print("Informe o ano de lançamento do filme: ");
                int anoFilme = sc.nextInt();

                System.out.printf("CADASTRO REALIZADO COM SUCESSO!\n" +
                        "\tFILME: %s\n" +
                        "\tDESCRIÇÃO: %s\n" +
                        "\tGENERO: %s\n" +
                        "\tANO DE LANÇAMENTO: %d", nomeFilme,descricaoFilme,generoFime,anoFilme);
                break;
            case 2:
                System.out.print("Informe o nome da serie: ");
                String nomeSerie = sc.nextLine();
                System.out.print("Informe a produtora da serie: ");
                String produtoraSerie = sc.nextLine();
                System.out.print("Informe o ano de lançamento da serie: ");
                int anoSerie = sc.nextInt();

                System.out.printf("CADASTRO REALIZADO COM SUCESSO!\n" +
                        "\tSERIE: %s\n" +
                        "\tPRODUTORA: %s\n" +
                        "\tANO DE LANÇAMENTO: %d", nomeSerie,produtoraSerie,anoSerie);
                break;
            case 3:
                System.out.print("Informe o nome do documentario: ");
                String nomeDocumentario = sc.nextLine();
                System.out.print("Informe o tema do documentario: ");
                String temaDocumentario = sc.nextLine();
                System.out.print("Informe o ano de lançamento do documentario: ");
                int anoDocumentario = sc.nextInt();

                System.out.printf("CADASTRO REALIZADO COM SUCESSO!\n" +
                        "\tDOCUMENTARIO: %s\n" +
                        "\tTEMA: %s\n" +
                        "\tANO DE LANÇAMENTO: %d", nomeDocumentario,temaDocumentario,anoDocumentario);
                break;
            default:
                System.out.println("Opção inválida. ");
                break;
        }
    }

}
