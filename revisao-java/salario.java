package atividades;

import java.util.Scanner;

public class salario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salário: R$ ");
        double salario = sc.nextDouble();

        while(salario <= 0){
            System.out.print("Salário invalido. Digite novamente: R$ ");
            salario = sc.nextDouble();
        }

        if(salario > 1997.58 && salario <= 5399.99){
            System.out.println("Salário maior que R$ 1997,58");
        } else if(salario > 5399.99){
            System.out.println("Salario maior que R$ 5399,99");
        }

    }
    
}
