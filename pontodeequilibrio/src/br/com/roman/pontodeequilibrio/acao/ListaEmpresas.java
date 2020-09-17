package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.roman.pontodeequilibrio.models.Banco;
import br.com.roman.pontodeequilibrio.models.Empresa;

public class ListaEmpresas implements Acao{

	
		public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			
	Banco banco = new Banco();
		List<Empresa> empresas= banco.getEmpresas();
		
		req.setAttribute("empresas", empresas);
		
		return "forward:listaEmpresas.jsp";
		
	}
}
