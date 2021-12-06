package model;

public class Empresa extends BaseModel{
    public String empresa;
    public String cnpj;
    public String atividade;

    public Empresa(){
        super();
    }

    public Empresa(String empresaString){
        String[] dados = empresaString.split(";");
        this.id = Integer.parseInt(dados[0]);
        this.empresa = dados[1];
        this.cnpj = dados[2];
        this.atividade = dados[3];
    }
    
    @Override
    public String toString() {
        String retorno = String.format("%s;%s;%s;%s", super.toString(), this.empresa, this.cnpj, this.atividade);
        return retorno;
    }

}
