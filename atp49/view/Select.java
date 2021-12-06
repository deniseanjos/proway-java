package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class Select {

    public static void main(String[] args) {
        
        //Criando conexão com ConnectionFactory do Utils
        try(Connection conn = new ConnectionFactory().getConnection()) {
            

            //Query SQL
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM tb_categoria");

            //Consulta
            prepStatement.execute();

            //Retorno da consulta
            ResultSet result = prepStatement.getResultSet();

            //Impressao do retorno
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                System.out.printf("%d\t%s\t\t\t%s\n", id, nome, descricao);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Não foi possível conectar ao banco.");
        }
    }

}