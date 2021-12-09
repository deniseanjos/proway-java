package com.prowayjava.atp57.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.prowayjava.atp57.models.Produto;

public class ProdutoDao {
	
	public int insert(Produto model){
		int idGerado = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            String sql = "INSERT INTO tb_produto(nome, descricao, preco, categoria_id)values(?, ?, ?, ?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.setFloat(3, model.getPreco());
            prepStatement.setInt(4, model.getCategoria_id());

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
	public ArrayList<Produto> read() {
        ArrayList<Produto> list = new ArrayList<Produto>();

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM tb_produto");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                Produto model = new Produto();                
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                model.setDescricao(result.getString("descricao"));
                model.setPreco(result.getFloat("preco"));
                model.setCategoria_id(result.getInt("categoria_id"));
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public int update(Produto model) {
        int linhasAfetadas = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) {                 
            
            String sql = "UPDATE tb_produto SET nome=?, descricao=?, preco=?, categoria_id? WHERE id = ?";            
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.setFloat(3, model.getPreco());
            prepStatement.setInt(4, model.getCategoria_id());
            prepStatement.setInt(5, model.getId());

            prepStatement.execute();  
                      
            linhasAfetadas = prepStatement.getUpdateCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhasAfetadas;
    }

    public int delete(Produto model) {
        int linhasAfetadas = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {     
            String sql = "DELETE FROM tb_produto WHERE id = ?";

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
