package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitura {

    public static void main(String[] args) {

        // JAVA IO

        try {
            // Fluxo de entrada em bytes
            FileInputStream fis = new FileInputStream("dados/file.txt");
            // Leitor que já converte para char, porém le caracter por caracter
            InputStreamReader isr = new InputStreamReader(fis);

            // Opção de leitura manual
            // char[] dados = new char[5];
            // isr.read(dados, 0, 5);
            // System.out.println(dados);

            // Opção de leitura onde lê todos os caracteres e armazena para saída
            // convertendo os bytes
            BufferedReader br = new BufferedReader(isr);
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }

            br.close();

            System.out.println("Arquivo encontrado.");
        } catch (Exception e) {
            System.out.println("Arquivo não encontrado.");
        }

    }

}
