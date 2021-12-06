public class TelaBanco {

    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(1200.00, "ATC-123");

        System.out.println(cc);

        System.out.println("VALOR APÓS SAQUE: " + cc.sacar(100.00));

        System.out.println("VALOR APÓS DEPÓSITO: " + cc.depositar(500.00));

    }
    
}
