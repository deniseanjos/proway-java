package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionFactory;

public class Insert {

    public static void main(String[] args) {
        
        //Criando conexão com ConnectionFactory do Utils
        try(Connection conn = new ConnectionFactory().getConnection()) {

            //Variaveis (inicializadas, mas poderiam ser externas)
            String nome = "Nome categoria";
            String descricao = "Teste categoria por SQL Injection";

            //Query SQL
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO tb_categoria (nome, descricao) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);

            //Alinhando a ordem dos values no prepSt.
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);

            //Execução
            prepStatement.execute();
        
            //Retorno da query
            ResultSet ids = prepStatement.getGeneratedKeys();

            //Impressao das ids criadas
            while(ids.next()){
                int id = ids.getInt(1);
                String nomeIds = ids.getString(2);
                String descricaoIds = ids.getString(3);
                System.out.printf("%d\t%s\t%s\n", id, nomeIds, descricaoIds);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}