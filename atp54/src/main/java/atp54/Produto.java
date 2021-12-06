package atp54;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String nomeProd = req.getParameter("nome");
		String valorProd = req.getParameter("valor");
		String idProd = req.getParameter("id_categoria");

		out.println("Modulo Produto");

		if (idProd != null) {
			int id_categoria = Integer.parseInt(idProd);
			out.printf("\nID: %d", id_categoria);
		}
		if(nomeProd != null){
			out.printf("\nNome: %s", nomeProd);
		}
		if (valorProd != null ) {
			double parametroValor = Double.parseDouble(valorProd);
			out.printf("\nValor: %.2f", parametroValor);
		}
	}

}
