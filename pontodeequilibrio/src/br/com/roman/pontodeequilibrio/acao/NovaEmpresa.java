package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.pontodeequilibrio.models.Banco;
import br.com.roman.pontodeequilibrio.models.Empresa;

public class NovaEmpresa implements Acao {

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String nomeParam=req.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeParam);
		
		Banco banco = new Banco ();
		banco.adiciona(empresa);
		
		req.setAttribute("empresa", empresa);
		
		return "sendRedirect:entrada?acao=ListaEmpresas";
		
		
	}

}
