package dao;

import java.util.ArrayList;

public interface IDao<T> {
    //Interface diz o que uma classe deve ter mas não faz a implementação
    public void save(T model);
    public ArrayList<Object> list();
    public void update(T model);
    public void remove(T model);
}
