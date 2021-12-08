package com.prowayjava.atp56.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.prowayjava.atp56.dao.CategoriaDao;
import com.prowayjava.atp56.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/list")
public class CategoriaReadServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        CategoriaDao dao = new CategoriaDao();

        for(Categoria model : dao.read()){
            out.printf("%d \t %s \t %s\n", model.getId(), model.getNome(), model.getDescricao());
        }
    }
}
