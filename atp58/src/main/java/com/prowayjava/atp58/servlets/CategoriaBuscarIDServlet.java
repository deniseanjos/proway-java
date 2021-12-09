package com.prowayjava.atp58.servlets;

import java.io.IOException;

import com.prowayjava.atp58.dao.CategoriaDao;
import com.prowayjava.atp58.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/selecionar")
public class CategoriaBuscarIDServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        int id = Integer.parseInt(req.getParameter("id"));

        Categoria model = dao.readByID(id);

        RequestDispatcher reqDis = req.getRequestDispatcher("/categoria-atualizar.jsp");
    
        req.setAttribute("model", model);
        reqDis.forward(req, resp);
    }
    
}
