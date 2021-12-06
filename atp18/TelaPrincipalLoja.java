public class TelaPrincipalLoja {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto();

        p1.setCodigo(123);
        p1.setNome("Produto 123");
        p1.setDescricao("Descricao Produto 123");
        p1.setValor(123.44);

        int codigo = p1.getCodigo();
        String nome = p1.getNome();
        String descricao = p1.getDescricao();
        double valor = p1.getValor();

        System.out.printf("CODIGO DO PRODUTO: %d\nNOME: %s\nDESCRIÇÃO: %s\nVALOR: %.2f",codigo,nome,descricao,valor);
    }
}
