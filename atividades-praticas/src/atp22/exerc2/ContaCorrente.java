public class ContaCorrente {

    private double saldo;
    private double taxaSaque = 1.25;
    private String codigoCliente;

    public ContaCorrente(double saldo, double taxaSaque, String codigoCliente){
        this.saldo = saldo;
        this.taxaSaque = taxaSaque;
        this.codigoCliente = codigoCliente;
    }

    public void sacar(double valor){
        this.saldo -= (valor - taxaSaque);
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    
}
