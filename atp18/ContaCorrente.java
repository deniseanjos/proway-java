public class ContaCorrente {
    
    private int agencia;
    private int numero;
    private String codigoCliente;
    private double saldo;

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCodigoCliente(){
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente){
        this.codigoCliente = codigoCliente;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
