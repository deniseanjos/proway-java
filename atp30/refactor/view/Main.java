package refactor.view;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import refactor.controller.CalculadoraController;
import refactor.model.Calculadora;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char continua;

        do {
            imprime_menu();
            int op = escolha_menu(sc, 1, 4);
            executa_menu(op, sc);
            continua = continuar_menu("\nDeseja continuar? (S/N): ", 'S', 'N', sc);
        } while (continua == 'S');
        
    }
    
    private static void imprime_menu() {
        System.out.println("=================================== CALCULADORA ===================================");
        System.out.println("1 - SOMAR\t\t2 - SUBTRAIR\t\t3 - MULTIPLICAR\t\t4 - DIVIDIR");
    }

    private static int escolha_menu(Scanner sc, int valorInicial, int valorFinal) {
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
                System.out.printf("Error: %s. Este campo aceita apenas números inteiros. Digite novamente.\n", e.getMessage());
                ok = false;
            }
        } while (!ok);
        return op;
    }

    private static void executa_menu(int op, Scanner sc){

        Calculadora calc = new Calculadora();
        CalculadoraController calcController = new CalculadoraController();

        int resultado = 0;

        calc.number1 = entrada_inteiros("Digite o 1º valor: ", sc);
        calc.number2 = entrada_inteiros("Digige o 2º valor: ", sc);

        switch(op){
            case 1:
            System.out.println("======== SOMAR ========");
            resultado = calcController.somar(calc);
            retorno_resultado("SOMAR", resultado);
            break;
            case 2:
            System.out.println("======== SUBTRAIR ========");
            resultado = calcController.subtrair(calc);
            retorno_resultado("SUBTRAIR", resultado);
            break;
            case 3:
            System.out.println("======== MULTIPLICAR ========");
            resultado = calcController.multiplicar(calc);
            retorno_resultado("MULTIPLICAR", resultado);
            break;
            case 4:
            System.out.println("======== DIVIDIR ========");
            try {
                resultado = calcController.dividir(calc);
                retorno_resultado("DIVIDIR", resultado);
            } catch (Exception e) {
                System.out.print("Não é possível dividir por 0. Inicie novamente. ");
            }
            break;
        }
        
    }

    private static int entrada_inteiros(String mensagem, Scanner sc) {
        int entrada = 0;
        boolean ok = true;
        do {
            try {
                System.out.printf(mensagem);
                entrada = Integer.parseInt(sc.nextLine());
                ok = true;
            } catch (Exception e) {
                System.out.printf("Error: %s. Este campo aceita apenas numeros inteiros.\n", e.getMessage());
                ok = false;
            }
        } while (!ok);
        return entrada;
    }

    private static void retorno_resultado(String operacao, int resultado) {
        System.out.printf("O resultado da %s foi: %d.\n", operacao, resultado);
    }

    private static char continuar_menu(String mensagem, char positivo, char negativo, Scanner sc){
        System.out.println(mensagem);
        char entrada = 'T';
        try {
            entrada = sc.nextLine().toUpperCase().charAt(0);
            while(entrada != positivo && entrada != negativo){
                System.out.printf("Opção inválida. Digite uma das opções válidas (%s para SIM ou %s para NÃO): ", positivo, negativo);
                entrada = sc.nextLine().toUpperCase().charAt(0);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return entrada;
    }

}
