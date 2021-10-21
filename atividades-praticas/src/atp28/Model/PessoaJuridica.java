package Model;

public class PessoaJuridica extends Pessoa {
    public String cnpj;
    public Endereco enderecoComercial;

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + this.cnpj + "\n==> Endereço comercial: " + this.enderecoComercial;
    }
}
