public class TelaPrincipalBanco {

    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(1234);
        cc.setNumero(3673);
        cc.setCodigoCliente("CL-4455");
        cc.setSaldo(1500.99);

        int agencia = cc.getAgencia();
        int numero = cc.getNumero();
        String codCliente = cc.getCodigoCliente();
        double saldo = cc.getSaldo();

        System.out.printf("AGÊNCIA: %d\nNÚMERO: %d\nCÓDIGO CLIENTE: %s\nSALDO: R$ %.2f", agencia, numero, codCliente, saldo);
        

    }
    
}
