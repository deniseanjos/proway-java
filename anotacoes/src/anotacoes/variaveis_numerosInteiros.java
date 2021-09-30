package anotacoes;

public class variaveis_numerosInteiros {

    public static void main(String[] args) {

        // Byte = 8bits - 0-255
        System.out.println("---------- BYTE ----------");
        byte minB = Byte.MIN_VALUE;
        byte maxB = Byte.MAX_VALUE;
        System.out.println("MIN: " + minB + " | MAX: " + maxB);

        // Short = 2bytes - 16bits - 
        System.out.println("---------- SHORT ----------");
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        System.out.println("MIN: " + minS + " | MAX: " + maxS);

        // Int - 4bytes - 32bits -
        System.out.println("---------- INT ----------");
        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        System.out.println("MIN: " + minI + " | MAX: " + maxI);
        
        // Long 8bytes - 64bits - 
        System.out.println("---------- LONG ----------");
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;
        System.out.println("MIN: " + minL + " | MAX: " + maxL);

    }

}