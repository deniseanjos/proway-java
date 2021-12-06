package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Both {

    public static void main(String[] args) {
        
        try {
            InputStream fis = new FileInputStream("dados/file.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            OutputStream fos = new FileOutputStream("dados/file2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

                      
            while (br.ready()) {
                String line = br.readLine();
                bw.write(line);
                bw.newLine();
            }

            bw.close();
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não localizado e não foi possível criar um novo.");
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo.");
        }

    }
}