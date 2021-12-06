public class Teste {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.setCodigoCliente("ABC-1234");
        String codC1 = c1.getCodigoCliente();
        c1.setSaldo(100.00);
        double saldoInicialC1 = c1.getSaldo();
        c1.transferencia(10.00);
        double saldoFinalC1 = c1.getSaldo();

        System.out.printf("\nCÓDIGO CLIENTE 1: %s\nSALDO INICIAL: %.2f\nSALDO APÓS TRANSFERENCIA: %.2f\n", codC1, saldoInicialC1, saldoFinalC1);

        ContaCorrente c2 = new ContaCorrente();
        c2.setCodigoCliente("CC-1234");
        String codC2 = c2.getCodigoCliente();
        c2.setSaldo(150.00);
        double saldoInicialC2 = c2.getSaldo();
        c2.transferencia(20);
        double saldoFinalC2 = c2.getSaldo();

        System.out.printf("\nCÓDIGO CLIENTE 2: %s\nSALDO INICIAL: %.2f\nSALDO APÓS TRANSFERENCIA: %.2f\n", codC2, saldoInicialC2, saldoFinalC2);

        c2.transferencia(5);
        c2.transferencia(5);
        c2.transferencia(5);
        c2.transferencia(5);
        double saldoApos5Transferencias = c2.getSaldo();
        System.out.printf("Saldo apos 5 transferências: %.2f", saldoApos5Transferencias);

    }
    
}
