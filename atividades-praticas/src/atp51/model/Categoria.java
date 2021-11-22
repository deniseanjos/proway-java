package model;

public class Categoria {

    private int id;
    private String nome;
    private String descricao;

    public Categoria(String nome){
        this.nome = nome;
    }

    public Categoria(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Categoria(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Categoria(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String retorno = String.format("%d\t%s\t\t\t%s\n", this.id, this.nome, this.descricao);
        return retorno;
    }
    
}
