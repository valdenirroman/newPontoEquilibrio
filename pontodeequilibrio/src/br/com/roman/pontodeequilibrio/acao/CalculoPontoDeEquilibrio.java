package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculoPontoDeEquilibrio implements Acao{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String nomeEmpresaParam=req.getParameter("nome");
		String custosParam=req.getParameter("custos");
		double custos =Double.parseDouble(custosParam);
		String margemContribParam=req.getParameter("margemContribuicao");
		double margemContribuicao=Double.parseDouble(margemContribParam);
		
		PontoDeEquilibro pontoDeEquilibrio = new PontoDeEquilibro();
		pontoDeEquilibrio.setNomeEmpresa(nomeEmpresaParam);
		pontoDeEquilibrio.setCustos(custos);
		
		double calculoPontoEquilibrio=pontoDeEquilibrio.calcula(custos,margemContribuicao);
					
		
		
		req.setAttribute("calculopontoEquilibrio",calculoPontoEquilibrio);
		req.setAttribute("pontoDeEquilibrio",pontoDeEquilibrio);
		
		return "forward:calculoPontoDeEquilibrio.jsp";
	}
		
		
}


