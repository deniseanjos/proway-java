import java.util.Scanner;

public class InformacoesExternas {

    static Scanner sc = new Scanner(System.in);
    static Calculadora calcImpostos = new Calculadora();

    public static void main(String[] args) {
        char continua = 'N';

        menu();
        escolha_menu();
    }

    static void menu() {
        System.out.println("======================= CALCULADORA DE IMPOSTOS =======================");
        System.out.println("\t1 - ISS\t\t\t2 - IOF\t\t\t3 - IR");
        System.out.println("=======================================================================");
    }

    static int escolha_menu() {
        int op;

        do {
            System.out.print("\nInforme a opção desejada: ");
            op = Integer.parseInt(sc.nextLine());
            if (op < 1 || op > 3) {
                System.out.println("\nOpção inválida. Digite novamente.");
            }
        } while (op < 1 || op > 3);

        return op;
    }

    static void opcao_escolhida(int op) {
        switch (op) {
            case 1:
                System.out.println("=============== CALCULO ISS ===============");
                break;
            case 2:
                System.out.println("=============== CALCULO IOF ===============");
                break;
            case 3:
                System.out.println("=============== CALCULO IR ================");
                break;
        }
    }

    static double calcIss() {
        System.out.print("Digite o valor para calculo do ISS: ");
        double valor = Double.parseDouble(sc.nextLine());
        double impIss = calcImpostos.calcular_iss(valor);
        return impIss;
    }

    static double calcIr() {
        System.out.print("Digite o valor para calculo do IR: ");
        double valor = Double.parseDouble(sc.nextLine());
        double impIr = calcImpostos.calcular_ir(valor);
        return impIr;
    }

    static double calcIof() {
        System.out.print("Digite o valor para calculo do IOF: ");
        double valor = Double.parseDouble(sc.nextLine());
        double impIof = calcImpostos.calcular_iof(valor);
        return impIof;
    }

}
