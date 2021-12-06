package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Empresa;

public class EmpresaDao extends BaseDao<Empresa>{

    public EmpresaDao(){
        super("dados/empresa.csv");
    }
    
    public ArrayList<Object> list(){
        ArrayList<Object> empresas = new ArrayList<Object>();
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                Empresa e = new Empresa(line);
                empresas.add(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return empresas;
    }

}
