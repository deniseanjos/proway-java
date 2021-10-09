public class TelaCalculadora {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        int somaInt = calc.soma(10,20);
        double somaDouble = calc.soma(20.0, 50.1);
        float somaFloat = calc.soma(10.0f, 20.4f, 7.12f);
        long somaLong = calc.soma(192, 19863, 1873903);

        System.out.println("SOMA INT: " + somaInt);
        System.out.println("SOMA INT: " + somaDouble);
        System.out.println("SOMA INT: " + somaFloat);
        System.out.println("SOMA INT: " + somaLong);

    }
    
}
