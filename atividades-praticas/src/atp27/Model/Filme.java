package Model;

public class Filme {
    public int id;
    public String nome;
    public String genero;
    public double duracao;

    @Override
    public String toString() {
        return "\nNome filme: " + this.nome + "\nGenero: " + this.genero + "\nDuração: " + this.duracao;
    }
}