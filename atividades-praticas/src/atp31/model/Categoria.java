package model;

public class Categoria extends Base {
    public String categoria;

    @Override
    public String toString() {
        return super.toString() + "\nNome Categoria: " + this.categoria;
    }
    
}
