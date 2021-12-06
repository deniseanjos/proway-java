package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    public static void main(String[] args) {
        
        try {
            //Inicializacao das variaveis
            int id = 9;

            //Conexão com banco
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            //Passando a query através de variavel
            String query = "DELETE FROM tb_categoria WHERE id = ?";

            //Query SQL
            PreparedStatement prepStatement = conn.prepareStatement(query);

            //Indicando indez onde a variavel de ID esta localizada
            prepStatement.setInt(1, id);
            
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