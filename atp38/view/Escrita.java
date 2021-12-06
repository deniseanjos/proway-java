package view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

import javax.sound.midi.Soundbank;

public class Escrita {

    public static void main(String[] args) {

        try {
            //Pegar o aquivo e, se não localizar, dar erro
            FileOutputStream fos = new FileOutputStream("dados/contacts.txt");
            //Fluxo de escrita
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            //Acumular o que esta sendo digitado
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Escrevendo pelo bw");
            bw.newLine();
            bw.write("Pulei linha\nEscrevi outra linha no mesmo write");
            bw.write("\n\t\tEscrevi outra linha com tabulacao");
            bw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Arquivo não localizado e não foi possível criar um novo.");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Não foi possível escrever no arquivo.");
        }

        
    }

}