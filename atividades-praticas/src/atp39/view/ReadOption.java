package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadOption {

    public static void main(String[] args) {

        // File f = new File("dados/file.txt");

        try {
            Scanner sc = new Scanner(new File("dados/file2.txt")); // System.in
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
