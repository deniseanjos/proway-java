package Model;

public class Endereco extends Base {
    private String tipo;
    public String logradouro;
    public String numero;
    public String complemento;
    public String cep;
    public String cidade;
    public String estado;

    public Endereco(String tipoEndereco){
        this.tipo = tipoEndereco;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tTipo de endereço: " + this.tipo + "\n\tLogradouro: " + this.logradouro;
    }
}
