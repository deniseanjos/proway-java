package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.ConnectionFactory;

public class Delete {

    public static void main(String[] args) {

        // Try with Resources
        // Conexão atravpes do ConnectionFactory em Utils
        try (Connection conn = new ConnectionFactory().getConnection();) {
            // Inicializacao das variaveis
            int id = 12;

            // Passando a query através de variavel
            String query = "DELETE FROM tb_categoria WHERE id = ?";

            // Query SQL
            try (PreparedStatement prepStatement = conn.prepareStatement(query)) {
                // Indicando index onde a variavel de ID esta localizada
                prepStatement.setInt(1, id);

                prepStatement.execute();

                // Ver quantas linhas foram afetadas pela alteração
                int lines = prepStatement.getUpdateCount();
                System.out.println("Linhas afetadas: " + lines);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}