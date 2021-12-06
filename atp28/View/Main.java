package View;

import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Endereco;

import Controller.EnderecoController;
import Controller.PessoaFisicaController;
import Controller.PessoaJuridicaController;


public class Main {

    public static void main(String[] args) {

        EnderecoController endController = new EnderecoController();
        PessoaFisicaController pfController = new PessoaFisicaController();
        PessoaJuridicaController pjController = new PessoaJuridicaController();

        Endereco endRes1 = new Endereco("Residencial");
        endRes1.id = 1;
        endRes1.logradouro = "Av. Socorro";
        endRes1.numero = "666";
        endRes1.complemento = "Ceu";
        endRes1.cep = "08000-0000";
        endRes1.cidade = "Cidade de Deus";
        endRes1.estado = "Emergencial";

        PessoaFisica pf1 = new PessoaFisica();
        pf1.id = 666;
        pf1.nome = "Jesus";
        pf1.cpf = "666.666.666-66";
        pf1.enderecoResidencial = endRes1;

        endController.create(endRes1);
        pfController.create(pf1);

        Endereco endComer1 = new Endereco("Comercial");
        endComer1.id = 32;
        endComer1.logradouro = "Av. Exploracção";
        endComer1.numero = "188";
        endComer1.complemento = "Trabalhador";
        endComer1.cep = "18888-0000";
        endComer1.cidade = "Cidade do Patrão";
        endComer1.estado = "Socorro";

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.id = 23;
        pj1.nome = "Pessoa Juridica";
        pj1.cnpj = "00.000.000/0000-01";
        pj1.enderecoComercial = endComer1;

        pjController.create(pj1);
        endController.create(endComer1);

        System.out.println("========> LISTANDO PESSOAS FISICAS:");
        System.out.println(pfController.read());

        System.out.println("========> LISTANDO PESSOAS JURIDICAS:");
        System.out.println(pjController.read());

        System.out.println("========> LISTANDO APENAS OS ENDEREÇOS:");
        System.out.println(endController.read());

        System.out.println("Deletando endereco residencial");
        endController.delete(endRes1);

        System.out.println("========> LISTANDO APENAS OS ENDEREÇOS APÓS EXCLUSÃO:");
        System.out.println(endController.read());

        System.out.println("========> LISTANDO PESSOAS FISICAS APÓS EXCLUSÃO DE ENDEREÇO:");
        System.out.println(pfController.read());

    }
    
}
