package model;

public class Pratos extends Base {
    public String nome;
    public double peso;
    public double valor;

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nPrato: " + this.nome + "\nPeso: " + this.peso + "\nValor: " + this.valor;
    }
}
