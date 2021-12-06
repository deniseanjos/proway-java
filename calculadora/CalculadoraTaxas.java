package calculadora;

public class CalculadoraTaxas {

    private int quantidadeSaques;
    
    public double taxa_transferencia(double valorTransferencia){
        double taxaCobrada = valorTransferencia * (0.001 / 100);
        return taxaCobrada;
    }

    public double taxa_saque(){
        quantidadeSaques++;
        double taxaSaque = 0.0;

        if (quantidadeSaques % 5 == 0){
            taxaSaque = 1.30;
        }
        
        return taxaSaque;
    
    }
    
}
