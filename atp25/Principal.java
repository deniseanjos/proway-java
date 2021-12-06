public class Principal {
    
    public static void main(String[] args) {
        
        Computador c1 = new Computador();
        c1.marca = "COMP1";
        c1.discoRigido = "COMP1";
        c1.memoriaRam = "COMP1";
        c1.processador = "COMP1";

        Notebook n1 = new Notebook();
        n1.marca = "NOOT1";
        n1.discoRigido = "NOOT1";
        n1.memoriaRam = "NOOT1";
        n1.processador = "NOOT1";
        n1.bateria = "NOOT1";
        n1.velocidadeWifi = "NOOT1";
        n1.versaoBluetooth = "NOOT1";

        Desktop d1 = new Desktop();
        d1.marca = "DESK1";
        d1.discoRigido = "DESK1";
        d1.memoriaRam = "DESK1";
        d1.monitorExterno = "DESK1";
        d1.processador = "DESK1";
        d1.tamanhoGabinete = "DESK1";
        d1.fonte = "DESK1";

        System.out.println(d1);

        Object objC = c1;
        Object objN = n1;
        Object objD = d1;

        System.out.println(objN);

        Computador c2 = (Computador)objC;
        Notebook n2 = (Notebook)objN;
        Desktop d2 = (Desktop)objD;

        System.out.println("\n\nCOMPUTADOR C2\n\n");
        System.out.println(c2);
        System.out.println("\n\nNOTEBOOK N2\n\n");
        System.out.println(n2);
        System.out.println("\n\nDESKTOP D2\n\n");
        System.out.println(d2);

    }
}
