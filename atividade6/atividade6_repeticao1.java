package atividade6;

import java.util.Scanner;

public class atividade6_repeticao1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, sobrenome;
        int contador = 1;

        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.print("Informe seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("IMPRESSÃO ATRAVÉS DO LAÇO WHILE");

        while (contador <= 10) {
            System.out.printf("%d - %s %s \n", contador, nome, sobrenome);
            contador++;
        }

        System.out.println("IMPRESSÃO ATRAVÉS DO LAÇO FOR");

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d - %s %s \n", i, nome, sobrenome);
        }

    }
}
