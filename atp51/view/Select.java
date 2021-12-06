package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class Select {

    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection()) {
                      
            CategoriaDao dao = new CategoriaDao(conn);

            for(Categoria c : dao.list()){
                System.out.print(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}