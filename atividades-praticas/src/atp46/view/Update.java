package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    public static void main(String[] args) {
        
        try {

            //Conexão com banco
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String password = "123456";
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            Connection conn = DriverManager.getConnection(connectionString, user, password);
            // Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            //Query SQL
            Statement statement = conn.createStatement();
            //Insert com o salvamento local das keys
            String query = "UPDATE tb_pessoa SET nome = 'Vanessão' WHERE id = 5";
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