package atividade6;

public class atividade6_repeticao3 {

    public static void main(String[] args) {

        double invest = 5000, taxaJuros = 0.02, acresMes = 0.0;
        int qtdMeses = 24;

        for (int i = 0; i < qtdMeses; i++){
            acresMes = invest * taxaJuros;
            invest += acresMes;
            System.out.printf("%d° mês: R$ %.2f \n", i+1, invest);
        }
    }
}
