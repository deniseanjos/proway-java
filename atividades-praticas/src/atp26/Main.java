public class Main {
    
    public static void main(String[] args) {
    
        Pessoa p1 = new Pessoa();
        p1.nome = "Deniso";
        p1.sobrenome = "Anjo";
        p1.idade = 25;

        //System.out.println(p1);

        Aluno a1 = new Aluno();
        a1.nome = "Joao";
        a1.sobrenome = "Silva";
        a1.idade = 18;
        a1.curso = "Dados";
        a1.turma = "TD1";
        a1.matricula = "MTD123";

        // System.out.println(a1);

        Dados dados = new Dados();
        System.out.println("\nP1: " + dados.adicionar(p1));
        System.out.println("A1: " + dados.adicionar(a1));
        // System.out.println("\nTamanho: " + dados.mostrarTamanho());

        System.out.println("\n=== Imprimindo através do metodo ===");
        dados.imprimirDados();

        Pessoa p2 = p1;
        //System.out.println(p2);

        System.out.println("\nVerificando se localiza o cadastro do A1: " + dados.verificar(a1));
        System.out.println("\nVerificando se localiza o cadastro do P1: " + dados.verificar(p1));
        System.out.println("\nVerificando se localiza o cadastro do P2: " + dados.verificar(p2));

        System.out.println("\n=== Imprimindo novamente através do metodo ===");
        dados.imprimirDados();

        System.out.println("\nDeletando P1: " + dados.remover(p1));
        System.out.println("\nVerificando se localiza o cadastro da P1 após exclusão: " + dados.verificar(p1));

        System.out.println("\nTamanho: " + dados.mostrarTamanho());

        System.out.println("\n=== Imprimindo novamente através do metodo após exclusão P1 ===");
        dados.imprimirDados();

        System.out.println("\nDeletando A1: " + dados.remover(a1));
        System.out.println("\nVerificando se localiza o cadastro da A1 após exclusão: " + dados.verificar(a1));

        System.out.println("\nTamanho: " + dados.mostrarTamanho());

        System.out.println("\n=== Imprimindo novamente através do metodo após exclusão A1 ===");
        dados.imprimirDados();

    }
}
