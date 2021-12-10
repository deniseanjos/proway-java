package com.prowayjava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.prowayjava.model.Categoria;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Categorias ATP59" );
        
        Categoria model = new Categoria();
        model.setNome("Java Persistence 2");
        model.setDescricao("Atp59");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("atp59");
        EntityManager em = factory.createEntityManager();
             
        em.getTransaction().begin();
        em.persist(model);
        em.getTransaction().commit();
        
        List<Categoria> list = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList(); // SELECT * FROM CATEGORIA AS C
        
        for(Categoria cat : list) {
        	System.out.println(cat.getId());
        	System.out.println(cat.getNome());
        	System.out.println(cat.getDescricao());
        	System.out.println();
        }
        
    }
}
