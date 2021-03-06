public class Aluno {
    
    private String nomeCompleto;
    private int idade;
    private String matricula;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        String retorno = "\n-----------------------\n\nNOME COMPLETO: " + this.nomeCompleto + "\nIDADE: " + this.idade + "\nMATRICULA: " + this.matricula;
        return retorno;
    }

}