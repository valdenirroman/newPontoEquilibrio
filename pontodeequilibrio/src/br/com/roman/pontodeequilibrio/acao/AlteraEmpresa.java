package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.pontodeequilibrio.models.Banco;
import br.com.roman.pontodeequilibrio.models.Empresa;

public class AlteraEmpresa implements Acao{

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

		System.out.println("alterando a empresa");
		String nomeParam=req.getParameter("nome");
		String idParam=req.getParameter("id");
		Integer id=Integer.valueOf(idParam);
		
		Banco banco = new Banco();
		Empresa empresa=banco.buscaPorId(id);
		empresa.setNome(nomeParam);
		
		return "sendRedirect:entrada?acao=ListaEmpresas";
		
	}
	
	

}
