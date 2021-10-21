package Model;

public abstract class Pessoa extends Base{
    public String nome;

    @Override
    public String toString() {
        return super.toString() + "\nNome: " + this.nome;
    }
}