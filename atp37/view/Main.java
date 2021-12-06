package view;

import controller.PratosController;
import model.Pratos;

public class Main {
    
    public static void main(String[] args) {
        
        PratosController pc = new PratosController();

        Pratos p1 = new Pratos();

        p1.id = 1;
        p1.nome = "Lasanha";
        p1.peso = 350;
        p1.valor = 22.5;

        pc.create(p1);

        System.out.println(pc.read());

        Pratos p2 = new Pratos();

        p2.id = 2;
        p2.nome = "Parmegiana";
        p2.peso = 250;
        p2.valor = 21;

        pc.create(p2);

        System.out.println(pc.read());

        p1.nome = "Lasanhão";

        pc.update(p1);

        System.out.println(pc.read());
        
        pc.delete(p2);
        
        System.out.println(pc.read());
    }
}
