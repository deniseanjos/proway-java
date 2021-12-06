package com.prowayjava.atp55.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import com.prowayjava.atp55.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Categoria cat = new Categoria();

		cat.setNome(req.getParameter("nome"));
		cat.setDescricao(req.getParameter("descricao"));
		
		PrintWriter out = resp.getWriter();
		out.printf("Categoria Model");
       
		if(cat.getNome() != null){
			out.printf("\nNome: %s", cat.getNome());
		}
		
		if(cat.getDescricao() != null){
			out.printf("\nDescricao: %s", cat.getDescricao());

		}
	}
}
