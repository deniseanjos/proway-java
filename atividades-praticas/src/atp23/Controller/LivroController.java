import java.util.ArrayList;
import java.util.List;

public class LivroController {

    private List<Livro> listaLivros = new ArrayList<Livro>();

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
            deletar(livro);
            salvar(l);
        }
    }

    // DELETE
    public void deletar(Livro l) {
        listaLivros.remove(l);
    }

}
