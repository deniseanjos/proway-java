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

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoDao dao = new ProdutoDao();
		Produto model = new Produto();
		
		PrintWriter out = resp.getWriter();

		model.setNome(req.getParameter("nome"));
		String precoProd = req.getParameter("preco");
		model.setPreco(Float.parseFloat(precoProd));
		model.setDescricao(req.getParameter("descricao"));
		// String categoriaId = req.getParameter("categoria_id");
		// model.setIdCategoria(Integer.parseInt(categoriaId));
		model.setCategoria_id(Integer.parseInt(req.getParameter("categoria_id")));

		model.setId(dao.insert(model));

		out.println("Produto Model");

		out.printf("\nProduto salvo com sucesso! \nID: %d", model.getId());
		
	}

}
