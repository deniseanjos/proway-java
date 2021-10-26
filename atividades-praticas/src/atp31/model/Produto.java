package model;

public class Produto extends Base {
    public String nome;
    public String descricao;
    public double valor;
    public Categoria categoria;

    @Override
    public String toString() {
        return super.toString() + "\nNome Produto: " + this.nome + "\nDescrição Produto: " + this.descricao + "\nValor: " + this.valor + "\nCategoria do Produto: " + this.categoria;
    }
}