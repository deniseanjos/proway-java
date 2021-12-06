package dao;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.BaseModel;


public abstract class BaseDao<T extends BaseModel> implements IDao<T> {

    protected String filename;

    public BaseDao(String filename){
        this.filename = filename;
    }

    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(T model){
        updateOrRemove(model, true);
    }

    public void remove(T model){
        updateOrRemove(model, false);
    }

    public void updateOrRemove(T model, boolean update){
        try {
            ArrayList<String> listLines = new ArrayList<String>();
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                int id = Integer.parseInt(line.split(";")[0]);
                if(id == model.id){
                   if(update){
                       listLines.add(model.toString());
                   }
                } else {
                    listLines.add(line);
                }
            }
            FileWriter fw = new FileWriter(filename);
            for (String l : listLines) {
                fw.write(l+"\n");
            }
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
