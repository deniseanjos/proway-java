package Model;

public abstract class Base {
    public int id; 
    
    @Override
    public String toString() {
        return "\n\tID: " + this.id;
    }
}
