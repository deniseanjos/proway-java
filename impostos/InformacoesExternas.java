import java.util.Scanner;

public class InformacoesExternas {

    static Scanner sc = new Scanner(System.in);
    static Calculadora calcImpostos = new Calculadora();

    public static void main(String[] args) {

        menu();
        int op = escolha_menu();
        opcao_escolhida(op);

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
                double resultIss = calcIss();
                System.out.printf("O resultado do calculo de ISS foi de %.2f", resultIss);
                break;
            case 2:
                System.out.println("=============== CALCULO IOF ===============");
                double resultIof = calcIof();
                System.out.printf("O resultado do calculo de IOF foi de %.2f", resultIof);
                break;
            case 3:
                System.out.println("=============== CALCULO IR ================");
                double resultIr = calcIr();
                System.out.printf("O resultado do calculo de IR foi de %.2f", resultIr);
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
