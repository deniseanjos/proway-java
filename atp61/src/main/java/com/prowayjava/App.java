package com.prowayjava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.prowayjava.dao.CategoriaDao;
import com.prowayjava.model.Categoria;


public class App 
{
    public static void main( String[] args )
    {
        CategoriaDao dao = new CategoriaDao();
        
        Categoria model = new Categoria();
        
        model.setNome("Update Persiste");
        model.setDescricao("DAO");
        
        dao.create(model);
        
       
       
        for(Categoria cat : dao.read()) {
        	System.out.println(cat.getId());
        	System.out.println(cat.getNome());
        	System.out.println(cat.getDescricao());
        	System.out.println();
        }
        
    }
}
