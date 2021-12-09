package com.prowayjava.atp58.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.prowayjava.atp58.dao.ProdutoDao;
import com.prowayjava.atp58.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto/list")
public class ProdutoReadServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ProdutoDao dao = new ProdutoDao();

        for(Produto model : dao.read()){
            out.printf("%d \t %s \t %s \t %.2f \t %d\n", model.getId(), model.getNome(), model.getDescricao(), model.getPreco(), model.getCategoria_id());
        }
    }
}
