public class Livro {
    private int id;
    private String nome;
    private String autor;
    private int qtdPaginas;
    private String editora;

    public Livro(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public boolean equals(Object obj) {
        Livro livro = (Livro)obj;
        if(this.id == livro.id){
            return true;
        } else {
            return false;
        }
    }
    
}