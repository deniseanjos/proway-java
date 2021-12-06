public class Calculadora {
    private double impostoIss = 0.02;
    private double impostoIof = 0.03;
    private double impostoIr = 0.05;

    public double calcular_iss(double valorEntrada){
        double resultado = valorEntrada * impostoIss;
        return resultado;
    }

    public double calcular_iof(double valorEntrada){
        double resultado = valorEntrada * impostoIof;
        return resultado;
    }

    public double calcular_ir(double valorEntrada){
        double resultado = valorEntrada * impostoIr;
        return resultado;
    }
}
