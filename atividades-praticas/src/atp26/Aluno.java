public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aluno){
            Aluno a = (Aluno)obj;
            if(this.nome.equals(a.nome) && this.sobrenome.equals(a.sobrenome) && this.idade == a.idade && this.matricula.equals(a.matricula) && this.turma.equals(a.turma) && this.curso.equals(a.curso)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.matricula + "\nTurma: " + this.turma + "\nCurso: " + this.curso;
    }
}
