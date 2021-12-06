package atividade6;

public class atividade6_repeticao2 {

    public static void main(String[] args) {

        System.out.println("NUMEROS PARES ATÉ 100");

        for(int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("NUMEROS PRIMOS ATÉ 150");

        for(int i = 2; i <= 15; i++) {
            boolean primo = true;

            for(int j = 2; j < i; j++) {
                if (i % j == 0){
                    System.out.printf("Não é primo %d / %d \n", i, j);
                    primo = false;
                }
            }

            if (primo) {
                System.out.printf("É PRIMO: %d \n", i);
            }

        }

    }
}
