package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.PontosTuristicos;

public class PontosTuristicosDao extends BaseDao<PontosTuristicos> {

    public PontosTuristicosDao(){
        super("dados/pontosturisticos.csv");
    }

    public ArrayList<Object> list(){
        ArrayList<Object> pontos = new ArrayList<Object>();
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                PontosTuristicos e = new PontosTuristicos(line);
                pontos.add(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return pontos;
    }
    
}
