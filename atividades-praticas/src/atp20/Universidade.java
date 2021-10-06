public class Universidade {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();

        func.setDepartamento("Finanças");
        func.setMatricula(123456);
        func.setNome("Funcionario João");
        func.setSalario(1999.99);
        func.setSobrenome("Silva");

        Coordenador coord = new Coordenador();

        coord.setBonus(10);
        coord.setCursoCoordenado("Administração");
        coord.setDepartamento("Educação");
        coord.setMatricula(1789374);
        coord.setNome("Coordenador Carlos");
        coord.setSobrenome("Almeida");
        coord.setSalario(10000);
        
        Aluno aluno = new Aluno();

        aluno.setCurso("Programação");
        aluno.setMatricula(173805);
        aluno.setNome("Aluna Ana");
        aluno.setSobrenome("Jessica");
        aluno.setTurma("Turma B");
        
        System.out.println(func.getNome());
        System.out.println(coord.getNome());
        System.out.println(aluno.getNome());

    }

}
