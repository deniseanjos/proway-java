package poo;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Deniso";
        p1.sobrenome = "Anjos";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.nome = "Pessoa2";
        p2.sobrenome = "Sobrenome da Pessoa2";
        p2.idade = 29;

        System.out.printf("Nome completo P1: %s %s | Idade: %d\n", p1.nome, p1.sobrenome, p1.idade);
        System.out.printf("Nome completo P2: %s %s | Idade: %d\n", p2.nome, p2.sobrenome, p2.idade);

        imprime_pessoa(p1);
        imprime_pessoa(p2);

        p1.imprimir();
        p2.imprimir();        

    }

    static void imprime_pessoa(Pessoa p){
        System.out.printf("Nome completo: %s %s | Idade: %d\n", p.nome, p.sobrenome, p.idade);
    }

}
