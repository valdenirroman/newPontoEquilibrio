package br.com.roman.pontodeequilibrio.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.roman.pontodeequilibrio.acao.Acao;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String  acaoParam=req.getParameter("acao");

//		HttpSession sessao = req.getSession();
	//	boolean usuarioNaoestaLogado=(sessao.getAttribute("usuarioLogado")==null);
	//	boolean ehUmaAcaoProtegida=!(acaoParam.equals("Login")) || (acaoParam.equals("LoginForm"));
		
	//	if(ehUmaAcaoProtegida && usuarioNaoestaLogado) {
//			resp.sendRedirect("entrada?acao=FormLogin");
//			return;
	//	}
		
	
		
		String nomeClasse="br.com.roman.pontodeequilibrio.acao."+acaoParam;
		String nome;
		
		try {
			Class classe=Class.forName(nomeClasse);//carrega classe
			Acao acao=(Acao) classe.newInstance();
			nome= acao.executa(req,resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {			
			throw new ServletException(e);
		}
		

		String [] tipoEndereco=nome.split(":");
			if(tipoEndereco[0].equals("forward")) {
				RequestDispatcher rd= req.getRequestDispatcher("WEB-INF/views/"+tipoEndereco[1]);
				rd.forward(req, resp);
				
			}else {
				resp.sendRedirect(tipoEndereco[1]);
			}
	/*		
			String nome=null;
			if(acaoParam.equals("ListaEmpresas")) {		
			ListaEmpresas acao= new ListaEmpresas();
				nome=acao.executa(req, resp);
		} else if(acaoParam.equals("RemoveEmpresa")){		
			 RemoveEmpresa acao= new RemoveEmpresa();
				nome=acao.executa(req, resp);
		} else if(acaoParam.equals("MostraEmpresa")) {		
				MostraEmpresa acao= new MostraEmpresa();
				nome=acao.executa(req, resp);		
		} else if(acaoParam.equals("AlteraEmpresa")) {		
				AlteraEmpresa acao= new AlteraEmpresa();
				nome= acao.executa(req, resp);	
		} else if(acaoParam.equals("NovaEmpresa")) {	
				NovaEmpresa acao= new NovaEmpresa();
				nome= acao.executa(req, resp);
}      else if(acaoParam.equals("NovoFormularioEmpresa")) {	
	NovaEmpresa acao= new NovaEmpresa();
	nome= acao.executa(req, resp);
}
*/	
		
	}
}
