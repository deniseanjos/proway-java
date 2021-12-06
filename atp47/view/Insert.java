package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {
        
        try {

            //Conexão com banco
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            //Query SQL
            Statement statement = conn.createStatement();
            //Insert com o salvamento local das keys
            String query = "INSERT INTO tb_categoria (nome, descricao) VALUES ('Banho e Cama', 'Acessorios para banho e cama')";
            statement.execute(query, statement.RETURN_GENERATED_KEYS);
            //Retorno da query
            ResultSet ids = statement.getGeneratedKeys();
            //Impressao das ids criadas
            while(ids.next()){
                int id = ids.getInt(1);
                String nome = ids.getString(2);
                String descricao = ids.getString(3);
                System.out.printf("%d\t%s\t%s\n", id, nome, descricao);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}