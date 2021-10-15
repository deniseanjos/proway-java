import java.util.ArrayList;

public class LivroController {

    private ArrayList<Livro> listaLivros = new ArrayList<Livro>();

    // CREATE
    public void salvar(Livro l) {
        listaLivros.add(l);
    }

    // READ
    public ArrayList<Livro> listar() {
        return listaLivros;
    }

    // UPDATE
    public void alterar(Livro l) {
        if (listaLivros.contains(l)) {
            deletar(l);
            salvar(l);
        }
    }

    // DELETE
    public void deletar(Livro l) {
        listaLivros.remove(l);
    }

}
