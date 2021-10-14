public class Livro extends BaseModel {
    private String nome;
    private String autor;
    private int qtdPaginas;
    private String editora;

    public Livro(String nome, String autor){
        this.nome = nome;
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