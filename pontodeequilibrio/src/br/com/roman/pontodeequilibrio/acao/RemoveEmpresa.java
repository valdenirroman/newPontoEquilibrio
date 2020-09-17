package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.pontodeequilibrio.models.Banco;

public class RemoveEmpresa implements Acao {
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String idParam=req.getParameter("id");
	Integer id=	Integer.valueOf(idParam);
	System.out.println(id);
	
	Banco banco = new Banco();
	banco.removeEmpresa(id);
	
	return "sendRedirect:entrada?acao=ListaEmpresas";
		
	}

}
