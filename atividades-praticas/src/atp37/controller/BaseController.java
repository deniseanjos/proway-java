package controller;

import java.util.ArrayList;

public class BaseController<T> {
    
    private ArrayList<T> list;

    public BaseController(){
        this.list = new ArrayList<T>();
    }

    public boolean verifica(T object){
        if(this.list.contains(object)) {
            return true;
        } else {
            return false;
        }
    }

    // CRUD

    public void create(T object){
        this.list.add(object);
    }

    public ArrayList<T> read() {
        return this.list;
    }
    
    public void update(T object){
        if(this.list.contains(object)){
            this.delete(object);
            this.create(object);
        }
    }

    public void delete(T object){
        this.list.remove(object);
    }

}
