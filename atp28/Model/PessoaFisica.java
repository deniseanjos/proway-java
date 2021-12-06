package Model;

public class PessoaFisica extends Pessoa {
    public String cpf;
    public Endereco enderecoResidencial;

    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + this.cpf + "\n==> Endereço residencial: " + this.enderecoResidencial;
    }
}
