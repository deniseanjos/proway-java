package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class Update {

    public static void main(String[] args) {
        
        try {

            //Criacao de variaveis
            String nome = "Teste CF";
            int id = 10;

            //Criando conexão com ConnectionFactory do Utils
            Connection conn = new ConnectionFactory().getConnection();
            
            //Query SQL
            PreparedStatement prepStatement = conn.prepareStatement("UPDATE tb_categoria SET nome = ? where id = ?");
            
            //Alinhando as posições das variaveis no prepSt.
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

            //Execucao
            prepStatement.execute();

            //Ver quantas linhas foram afetadas pela alteração
            int lines = prepStatement.getUpdateCount();
            System.out.println("Linhas afetadas: " + lines);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}