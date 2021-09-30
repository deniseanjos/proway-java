package anotacoes;

public class variaveis_numerosFloat {

    public static void main(String[] args) {
        // Single Precision
        // Float - 4bytes - 32bits (precisão de 24bits) -
        System.out.println("---------- FLOAT ----------");
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        System.out.println("MIN: " + minF + " | MAX: " + maxF);
        
        // Double Precision
        // Double - 8bytes - 64bits (precisão de 53bits) -
        System.out.println("---------- DOUBLE ----------");
        double minD = Double.MIN_VALUE;
        double maxD = Double.MAX_VALUE;
        System.out.println("MIN: " + minD + " | MAX: " + maxD);

    }
}