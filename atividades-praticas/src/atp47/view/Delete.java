package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) {
        
        try {

            //Conexão com banco
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            //Query SQL
            Statement statement = conn.createStatement();
            //Insert com o salvamento local das keys
            String query = "DELETE FROM tb_categoria WHERE id > 5";
            statement.execute(query);
            //Ver quantas linhas foram afetadas pela alteração
            int lines = statement.getUpdateCount();
            System.out.println("Linhas afetadas: " + lines);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}