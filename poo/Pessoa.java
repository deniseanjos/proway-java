package poo;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;

    public void imprimir(){
        System.out.printf("\nNome completo: %s %s\nIdade: %d", nome, sobrenome, idade);
    }
}
