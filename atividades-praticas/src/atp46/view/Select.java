package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

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
            //Consulta
            statement.execute("SELECT * FROM TB_PESSOA");
            //Retorno da consulta
            ResultSet result = statement.getResultSet();
            //Impressao do retorno
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("%d\t%s\n", id, nome);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}