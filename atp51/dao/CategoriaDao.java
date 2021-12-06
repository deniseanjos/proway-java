package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Categoria;

public class CategoriaDao {

    private Connection conn;

    public CategoriaDao(Connection conn) {
        this.conn = conn;
    }

    // CRUD

    public void create(Categoria model) throws SQLException {
        // Query SQL
        PreparedStatement prepStatement = conn.prepareStatement(
                "INSERT INTO tb_categoria (nome, descricao) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);

        // Alinhando a ordem dos values no prepSt.
        prepStatement.setString(1, model.getNome());
        prepStatement.setString(2, model.getDescricao());

        // Execução
        prepStatement.execute();

        // Retorno da query
        ResultSet ids = prepStatement.getGeneratedKeys();

        // Impressao das ids criadas
        while (ids.next()) {
            int id = ids.getInt(1);
            String nomeIds = ids.getString(2);
            String descricaoIds = ids.getString(3);
            System.out.printf("%d\t%s\t%s\n", id, nomeIds, descricaoIds);
        }
    }

    public int update(Categoria model) throws SQLException {

        // Query SQL
        PreparedStatement prepStatement = conn.prepareStatement("UPDATE tb_categoria SET nome = ? where id = ?");

        // Alinhando as posições das variaveis no prepSt.
        prepStatement.setString(1, model.getNome());
        prepStatement.setInt(2, model.getId());

        // Execucao
        prepStatement.execute();

        // Ver quantas linhas foram afetadas pela alteração
        int lines = prepStatement.getUpdateCount();

        return lines;
    }

    public List<Categoria> list() throws SQLException {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        // Query SQL
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM tb_categoria");

        // Consulta
        prepStatement.execute();

        // Retorno da consulta
        ResultSet result = prepStatement.getResultSet();

        // Impressao do retorno
        while (result.next()) {
            Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"), result.getString("descricao"));
            list.add(cat);
        }

        return list;
    }

    public int delete(int id) {
        int lines = 0;

        // Passando a query através de variavel
        String query = "DELETE FROM tb_categoria WHERE id = ?";

        // Query SQL
        try (PreparedStatement prepStatement = conn.prepareStatement(query)) {
            // Indicando index onde a variavel de ID esta localizada
            prepStatement.setInt(1, id);
            prepStatement.execute();
            // Ver quantas linhas foram afetadas pela alteração
            lines = prepStatement.getUpdateCount();
            System.out.println("Linhas afetadas: " + lines);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

}
