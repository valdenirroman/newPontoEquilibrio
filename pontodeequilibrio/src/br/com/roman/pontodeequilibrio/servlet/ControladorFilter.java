package br.com.roman.pontodeequilibrio.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.roman.pontodeequilibrio.acao.Acao;

//@WebFilter("/entrada")
public class ControladorFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		
			HttpServletRequest request= (HttpServletRequest) servletRequest;
			HttpServletResponse response= (HttpServletResponse) servletResponse;
			String  acaoParam=request.getParameter("acao");
			String nomeClasse="br.com.roman.pontodeequilibrio.acao."+acaoParam;
			String nome;
			
			try {
				Class classe=Class.forName(nomeClasse);//carrega classe
				Acao acao=(Acao) classe.newInstance();
				nome= acao.executa(request,response);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {			
				throw new ServletException(e);
			}
			

			String [] tipoEndereco=nome.split(":");
				if(tipoEndereco[0].equals("forward")) {
					RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/views/"+tipoEndereco[1]);
					rd.forward(request, response);
					
				}else {
					response.sendRedirect(tipoEndereco[1]);
				}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
