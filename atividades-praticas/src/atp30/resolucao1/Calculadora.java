package resolucao1;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 0, num1 = 0, num2 = 0, resultado = 0;

        menu();
        op = escolha_menu(sc, 1, 4);

        num1 = entrada_inteiros("Informe o 1º valor: ", sc);
        num2 = entrada_inteiros("Informe o 2º valor: ", sc);

        switch (op) {
        case 1:
            System.out.println("===== SOMAR ====");
            resultado = somar(num1, num2);
            retorno_resultado("SOMA", resultado);
            break;
        case 2:
            System.out.println("===== SUBTRAIR ====");
            resultado = subtrair(num1, num2);
            retorno_resultado("SUBTRAÇÃO", resultado);
            break;
        case 3:
            System.out.println("===== MULTIPLICAR ====");
            resultado = multiplicar(num1, num2);
            retorno_resultado("MULTIPLICAÇÃO", resultado);
            break;
        case 4:
            System.out.println("===== DIVIDIR ====");
            resultado = dividir(num1, num2);
            //retorno_resultado("DIVISÃO", resultado);
            if (resultado == -10) {
                System.out.println("Erro na divisão.");
            } else {
                retorno_resultado("DIVISÃO", resultado);
            }
            break;
        }

    }

    public static void menu() {
        System.out.println("=================================== CALCULADORA ===================================");
        System.out.println("1 - SOMAR\t\t2 - SUBTRAIR\t\t3 - MULTIPLICAR\t\t4 - DIVIDIR");
    }

    public static int escolha_menu(Scanner sc, int valorInicial, int valorFinal) {
        int op = 0;

        boolean ok = true;

        do {
            try {
                System.out.print("Digite a opção desejada: ");
                op = Integer.parseInt(sc.nextLine());
                while (op < valorInicial || op > valorFinal) {
                    System.out.print("Opção inválida. Digite novamente: ");
                    op = Integer.parseInt(sc.nextLine());
                }
                ok = true;
            } catch (Exception e) {
                System.out.printf("Error: %s. Este campo aceita apenas números inteiros.\n", e.getMessage());
                // op = -10;
                ok = false;
            }
        } while (!ok);
        return op;
    }

    public static int entrada_inteiros(String mensagem, Scanner sc) {
        int entrada = 0;
        boolean ok = true;
        do {
            try {
                System.out.printf(mensagem);
                entrada = Integer.parseInt(sc.nextLine());
                ok = true;
            } catch (Exception e) {
                System.out.printf("Error: %s. Este campo aceita apenas numeros inteiros.\n", e.getMessage());
                // entrada = -10;
                ok = false;
            }
        } while (!ok);
        return entrada;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        int calculo;

        try {
            calculo = a / b;
        } catch (ArithmeticException e) {
            System.out.printf("Error: %s. Não é possível dividir por 0.\n", e.getMessage());
            calculo = -10;
        }
        return calculo;
    }

    public static void retorno_resultado(String operacao, int resultado) {
        System.out.printf("O resultado da %s foi: %d.\n", operacao, resultado);
    }

}