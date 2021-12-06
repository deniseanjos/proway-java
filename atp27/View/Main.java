package View;

import Controller.FilmeController;
import Controller.SerieController;
import Model.Filme;
import Model.Serie;

public class Main {
    
    public static void main(String[] args) {
        
        FilmeController fc = new FilmeController();
        Filme f1 = new Filme();
        f1.id = 1;
        f1.nome = "Us";
        f1.genero = "Terror";
        f1.duracao = 1.30;
        fc.create(f1);
        Filme f2 = new Filme();
        f2.id = 2;
        f2.nome = "Corra!";
        f2.genero = "Terror";
        f2.duracao = 1.70;
        fc.create(f2);

        SerieController sc = new SerieController();
        Serie s1 = new Serie();
        s1.id = 1;
        s1.nome = "Olhos que condenam";
        s1.genero = "Drama";
        s1.quantidadeEpsodios = 8;
        sc.create(s1);

        System.out.println(fc.read());
        System.out.println(sc.read());

        //Deletando o filme F1
        fc.delete(f1);

        //Imprimindo lista apos exclusão
        System.out.println("\n=====> Lista de filmes após exclusão: \n" + fc.read());

        //Atualizando série
        s1.genero = "Drama baseado em história real";
        sc.update(s1);

        //Imprimindo após atuali
        System.out.println("\n=====> Lista de séries após atualização: \n" + sc.read());
    }
}
