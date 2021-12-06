package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;

public class Delete {

    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection();) {
            CategoriaDao dao = new CategoriaDao(conn);
            dao.delete(10);        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}