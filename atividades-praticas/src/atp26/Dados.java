public class Dados {

    int posicao = 0;
    Object[] dados = new Object[5];

    public String adicionar(Object obj){
        String msg;

        if(posicao < dados.length){
            dados[posicao] = obj;
            posicao++;
        } else {
            Object[] dados2 = new Object[dados.length+5];
            for(int i = 0; i < dados.length; i++){
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
        msg = "Salvo com sucesso!";
        return msg;
    }

    public int mostrarTamanho(){
        return posicao;
    }

    public String remover(Object obj){
        for(int i = 0; i < dados.length; i++){
            if(obj.equals(dados[i])){
                reorganizar(i);
                posicao--;
                return "Item removido com sucesso!";
            }
        }
        return "Não encontrado.";
    }

    public void reorganizar(int posicao){
        for(int i = posicao; i < dados.length-1; i++){
            this.dados[i] = this.dados[i+1];
        }
    }

    public String verificar(Object obj){
        for(int i = 0; i < posicao; i++){
            if(obj.equals(dados[i])){
                return "O item já existe!";
            }
        }
        return "Item não localizado.";
    }

    public void imprimirDados(){
        for(int i = 0; i < posicao; i++){
            System.out.println(dados[i]);
        }
    }
    
}
