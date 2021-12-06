package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class Update {

    public static void main(String[] args) {
    
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat = new Categoria(4, "Update DAO");
            System.out.println(dao.update(cat));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}