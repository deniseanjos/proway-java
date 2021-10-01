public class Principal{

    public static void main(String[] args) {

        Calculadora ci = new Calculadora();

        double valorIof = ci.calcular_iof(1800.00);
        double valorIss = ci.calcular_iss(1800.00);
        double valorIr = ci.calcular_ir(1800.00);

        double totalImpostos = valorIof + valorIr + valorIss;

        System.out.printf("O valor total dos impostos é de %.2f, sendo:\nIOF: %.2f\nISS: %.2f\nIR: %.2f", totalImpostos, valorIof, valorIss, valorIr);
        
    }
    
}