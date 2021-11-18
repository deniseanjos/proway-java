package view;

import java.io.PrintStream;

public class PrintStreamOption {

    public static void main(String[] args) {

        // PrintStream ps; necessita inicializar como null e trazer um finally para fechar

        try {
            PrintStream ps = new PrintStream("dados/printstreamfile.txt");
            ps.println("Teste");
            ps.println("Teste 2");
            ps.close();
        } catch (Exception e) {
            System.out.println("Não foi possível encontrar e/ou criar o arquivo.");
        }

    }
    
}
