package Model;

public class Serie {
    public int id;
    public String nome;
    public String genero;
    public double quantidadeEpsodios;

    @Override
    public String toString() {
        return "\nNome série: " + this.nome + "\nGenero: " + this.genero + "\nQuantidade de episódios: " + this.quantidadeEpsodios;
    }
    
}
