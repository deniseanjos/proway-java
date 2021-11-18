package view;

import controller.PontosTuristicosController;
import model.PontosTuristicos;

public class PontosTuristicosView {

    public static void main(String[] args) {
        
        PontosTuristicosController pc = new PontosTuristicosController();

        PontosTuristicos p1 = new PontosTuristicos();

        p1.id = 2;
        p1.nome = "";
        p1.descricao = "Estatua Famosa";
        p1.localizacao = "RJ";

        System.out.println("CRIANDO");
        pc.create(p1);

        for (Object p : pc.read()) {
            System.out.println(p);
        }
        
        System.out.println("ATUALIZANDO");

        p1.id = 2;
        p1.nome = "Colocando nome";
        p1.descricao = "Estatua Famosa";
        p1.localizacao = "RJ";

        pc.update(p1);

        for (Object p : pc.read()) {
            System.out.println(p);
        }

        System.out.println("DELETANDO");

        p1.id = 1;
        pc.delete(p1);
        
        for (Object p : pc.read()) {
            System.out.println(p);
        }

    }
    
}
