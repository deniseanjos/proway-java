package com.prowayjava.atp57.servlets;


import java.io.IOException;
// import java.io.PrintWriter;

import com.prowayjava.atp57.dao.CategoriaDao;
import com.prowayjava.atp57.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategoriaDao dao = new CategoriaDao();
		Categoria model = new Categoria();

		model.setNome(req.getParameter("nome"));
		model.setDescricao(req.getParameter("descricao"));

		model.setId(dao.insert(model));
		
		req.setAttribute("id", model.getId());
		RequestDispatcher rd = req.getRequestDispatcher("categoria-salva.jsp");
		rd.forward(req, resp);

	
	}
}
