import java.util.Scanner;

public class atividade8_metodos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cabecalho();
        double n1 = entrada("Informe o primeiro número: ");
        double n2 = entrada("Informe o segundo número: ");

        saida("SOMA", soma(n1,n2));
        saida("SUBTRAÇÃO" , subtracao(n1,n2));
        saida("DIVISÃO" , divisao(n1,n2));
        saida("MULTIPLICAÇÃO" , multiplicacao(n1,n2));

    }

    static void cabecalho(){
        System.out.println("=== CACULADORA ====");
    }

    static double entrada(String mensagem){
        System.out.print(mensagem);
        double entrada = Double.parseDouble(sc.nextLine());
        return entrada;
    }

    static void saida(String operacao, double resultado){
        System.out.printf("O resultado da %s foi %.2f \n", operacao, resultado);
    }

    static double soma(double num1, double num2){
        return num1 + num2;
    }

    static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    static double divisao(double num1, double num2){
        return num1 / num2;
    }

    static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }

}
