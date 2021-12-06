package atp54;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class Categoria extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeCat = req.getParameter("nome");
		String descricaoCat = req.getParameter("descricao");
		
		PrintWriter out = resp.getWriter();
		out.printf("Modulo Categoria");
       
        out.printf("\nInformacoes da Categoria:\nNome: %s - Descricao: %s", nomeCat, descricaoCat);
	}
}
