package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class Insert {

    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat = new Categoria("Teste DAO");
            Categoria cat2 = new Categoria("Teste DAO", "Descricao DAO");
            dao.create(cat);
            dao.create(cat2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}