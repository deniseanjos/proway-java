package classes;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Programa de Cadastro");

        Produto p1 = new Produto();

        p1.nome = "Celular";
        p1.descricao = "Samsung";
        p1.quantidade = 10;
        p1.valor = 1599.99;

        System.out.println(p1.descricao);
    }
}
