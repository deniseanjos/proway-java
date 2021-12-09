package com.prowayjava.atp57.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.prowayjava.atp57.dao.CategoriaDao;
import com.prowayjava.atp57.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/list")
public class CategoriaReadServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        CategoriaDao dao = new CategoriaDao();
        ArrayList<Categoria> categorias;

        String filter = req.getParameter("nome");

        if(filter != null && filter != "") {
            categorias = dao.read(filter);
        } else {
            categorias = dao.read();
        }
        
        req.setAttribute("categorias", categorias);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria-list.jsp");
        rd.forward(req, resp);
    }
}
