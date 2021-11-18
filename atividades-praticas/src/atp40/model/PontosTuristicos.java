package model;

public class PontosTuristicos extends BaseModel{
    public String nome;
    public String descricao;
    public String localizacao;

    public PontosTuristicos(){
        super();
    }

    public PontosTuristicos(String pontosString){
        String[] dados = pontosString.split(";");
        this.id = Integer.parseInt(dados[0]);
        this.nome = dados[1];
        this.descricao = dados[2];
        this.localizacao = dados[3];
    }

    @Override
    public String toString() {
        String retorno = String.format("%s;%s;%s;%s", super.toString(), this.nome, this.descricao, this.localizacao);
        return retorno;
    }
    
}
