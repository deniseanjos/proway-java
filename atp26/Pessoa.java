public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa)obj;
            if(this.nome.equals(p.nome) && this.sobrenome.equals(p.sobrenome) && this.idade == p.idade) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nNome Completo: " + this.nome + " " + this.sobrenome + "\nIdade: " + this.idade;
    }
}