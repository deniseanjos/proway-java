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
            statement.execute("SELECT * FROM tb_produto");
            //Retorno da consulta
            ResultSet result = statement.getResultSet();
            //Impressao do retorno
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                Double preco = result.getDouble("preco");
                int categoria_id = result.getInt("categoria_id");
                System.out.printf("%d\t%s\t\t%s\t\t%.2f\t%d\n", id, nome, descricao, preco, categoria_id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}