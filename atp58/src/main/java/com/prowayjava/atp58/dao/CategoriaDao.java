package com.prowayjava.atp58.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.prowayjava.atp58.models.Categoria;

public class CategoriaDao {
	
	public int insert(Categoria model){
		int idGerado = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            String sql = "INSERT INTO tb_categoria(nome, descricao)values(?, ?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());

            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                idGerado = ids.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idGerado;
    }

	public ArrayList<Categoria> read() {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM tb_categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            list = createList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Categoria> read(String nome) {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM tb_categoria WHERE nome = ?");
            prepStatement.setString(1, nome);
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            list = createList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Categoria readByID(int id) {
        Categoria model = new Categoria();    

        try(Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "SELECT * FROM tb_categoria WHERE id = ? ORDER BY id";

            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, id);
            prepStatement.execute();

            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                model.setDescricao(result.getString("descricao"));
                break;
            } 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    private ArrayList<Categoria> createList(ResultSet result) throws SQLException {
        ArrayList<Categoria> list = new ArrayList<Categoria>();
        while(result.next()){
            Categoria model = new Categoria();                
            model.setId(result.getInt("id"));
            model.setNome(result.getString("nome"));
            model.setDescricao(result.getString("descricao"));
            list.add(model);
        }
        return list;
    }

    public int update(Categoria model) {
        int linhasAfetadas = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) {                 
            
            String sql = "UPDATE tb_categoria SET nome=?, descricao=? WHERE id = ?";            
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.setInt(3, model.getId());

            prepStatement.execute();  
                      
            linhasAfetadas = prepStatement.getUpdateCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhasAfetadas;
    }

    public int delete(Categoria model) {
        int linhasAfetadas = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {     
            String sql = "DELETE FROM tb_categoria WHERE id = ?";

            try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, model.getId());
                prepStatement.execute();   
                linhasAfetadas = prepStatement.getUpdateCount();                  
            } catch (Exception e) {
                e.printStackTrace();
            }            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhasAfetadas;
    }

}
