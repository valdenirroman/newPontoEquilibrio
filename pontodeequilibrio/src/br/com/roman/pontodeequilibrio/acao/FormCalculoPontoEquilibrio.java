package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.pontodeequilibrio.models.Banco;
import br.com.roman.pontodeequilibrio.models.Empresa;

public class FormCalculoPontoEquilibrio implements Acao{

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		return "forward:formPontoDeEquilibrio.jsp";
		
		
	}

}
