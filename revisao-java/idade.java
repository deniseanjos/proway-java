package atividades;

import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        byte idade = sc.nextByte();

        if (idade < 25){
            System.out.println("Sua idade é MENOR que 25!");
        } else if (idade > 25) {
            System.out.println("Sua idade é MAIOR que 25!");
        } else {
            System.out.println("Sua idade é IGUAL a 25!");
        }


    }
    
}