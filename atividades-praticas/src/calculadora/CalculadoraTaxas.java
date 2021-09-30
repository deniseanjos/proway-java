package calculadora;

public class CalculadoraTaxas {
    
    public double taxa_transferencia(double valorTransferencia){
        double taxaCobrada = valorTransferencia * (0.001 / 100);
        return taxaCobrada;
    }
    
}
