package atividadesdiversas;

import java.util.Scanner;

public class atividade2_maiorIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, sobrenome;
        int idade;

        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();

        if(idade >= 18) {
            System.out.print("Digite seu nome: ");
            nome = sc.next();

            System.out.print("Digite seu sobrenome: ");
            sobrenome = sc.next();

            System.out.printf("CADASTRO REALIZADO COM SUCESSO!\nNOME COMPLETO: %s %s\nIDADE: %d", nome, sobrenome, idade);
        } else {
            System.out.println("Cadastro permitido apenas para maiores de idade.");
        }
    }
}
