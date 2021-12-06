package com.prowayjava.atp55.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import com.prowayjava.atp55.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Produto prod = new Produto();
		
		PrintWriter out = resp.getWriter();

		String nomeProd = req.getParameter("nome");
		String valorProd = req.getParameter("valor");
		String idCategoria = req.getParameter("id_categoria");

		prod.setNome(nomeProd);

		out.println("Produto Model");

		if (idCategoria != null) {
			prod.setIdCategoria(Integer.parseInt(idCategoria));
			out.printf("\nID: %d", prod.getIdCategoria());
		}
		if(nomeProd != null){
			out.printf("\nNome: %s", prod.getNome());
		}
		if (valorProd != null ) {
			prod.setValor(Float.parseFloat(valorProd));
			out.printf("\nValor: %.2f", prod.getValor());
		}
	}

}
