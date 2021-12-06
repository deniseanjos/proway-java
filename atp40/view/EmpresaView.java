package view;

import controller.EmpresaController;
import model.Empresa;

public class EmpresaView {

    public static void main(String[] args) {
        
        EmpresaController ec = new EmpresaController();
    
        Empresa e1 = new Empresa();
        // Empresa e2 = new Empresa();
    
        e1.id = 7;
        e1.empresa = "Tetete teste teste";
        e1.cnpj = "Teste CNPJ";
        e1.atividade = "Teste";
    
        ec.create(e1);
        // System.out.println(ec.read());
        // ec.delete(e2);

        for (Object e : ec.read()) {
            System.out.println(e);            
        }

        ec.delete(e1);

        System.out.println("APÓS EXCLUSÃO");
        
        for (Object e : ec.read()) {
            System.out.println(e);            
        }

        System.out.println("APÓS ATUALIZAÇÃO");

        e1.id = 4;
        e1.empresa = "Atualizando ID 4";
        e1.cnpj = "Teste CNPJ";
        e1.atividade = "Teste";

        ec.update(e1);

        for (Object e : ec.read()) {
            System.out.println(e);            
        }

    }

}
