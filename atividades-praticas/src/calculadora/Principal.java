package calculadora;

public class Principal {

    public static void main(String[] args) {

        CalculadoraTaxas c1 = new CalculadoraTaxas();

        double taxaTransferencia = c1.taxa_transferencia(1000);
        double taxaTransferencia2 = c1.taxa_transferencia(500);
        
        System.out.printf("Transf1: %.4f\n", taxaTransferencia);
        System.out.printf("Transf2: %.4f\n", taxaTransferencia2);

        double saque1 = c1.taxa_saque();
        double saque2 = c1.taxa_saque();
        double saque3 = c1.taxa_saque();
        double saque4 = c1.taxa_saque();
        double saque5 = c1.taxa_saque();
        double saque6 = c1.taxa_saque();
        double saque7 = c1.taxa_saque();
        double saque8 = c1.taxa_saque();
        double saque9 = c1.taxa_saque();
        double saque10 = c1.taxa_saque();
        double saque11 = c1.taxa_saque();
        
        System.out.println(saque1);
        System.out.println(saque2);
        System.out.println(saque3);
        System.out.println(saque4);
        System.out.println(saque5);
        System.out.println(saque6);
        System.out.println(saque7);
        System.out.println(saque8);
        System.out.println(saque9);
        System.out.println(saque10);
        System.out.println(saque11);

    }
}