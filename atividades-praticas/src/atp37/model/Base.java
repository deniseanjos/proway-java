package model;

public abstract class Base<T> {

    public int id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base outra = (Base)obj;
            if(this.id == outra.id){
                return true;
            }
        }
        return false;
    }

}
