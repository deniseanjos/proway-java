package view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOption {

    public static void main(String[] args) {

       FileWriter fs = null;

        
            try {
                fs = new FileWriter("dados/filewriterdoc.txt", true);
                fs.write("Teste\n");
                fs.write("Teste 2\t");
                fs.write("Teste 3\t\t\t");
                fs.write("Teste 4\t");
                fs.close();
            } catch (FileNotFoundException e) {
                System.out.println("Não foi possivel encontrar o arquivo.");
            } catch (IOException e) {
                // e.printStackTrace();
                System.out.println("Não foi possível escrever no arquivo.");
            }
        
    }
    
}
