public class ContaCorrente {

    private double saldo;
    private double taxaSaque = 1.25;
    private String codigoCliente;

    public ContaCorrente(double saldo, String codigoCliente){
        this.saldo = saldo;
        //this.taxaSaque = taxaSaque;
        this.codigoCliente = codigoCliente;
    }

    public double sacar(double valor){
        this.saldo -= (valor + taxaSaque);
        return this.saldo;
    }

    public double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }
    
    @Override
    public String toString() {
        return "SALDO: " + this.saldo + "\nTAXA SAQUE: " + this.taxaSaque + "\nCÓDIGO CLIENTE: " + this.codigoCliente;
    }
}
