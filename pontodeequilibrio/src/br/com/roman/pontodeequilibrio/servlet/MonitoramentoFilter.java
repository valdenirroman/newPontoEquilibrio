package br.com.roman.pontodeequilibrio.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req	, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		long antes=System.currentTimeMillis();
		
		String acaoParam=req.getParameter("acao");
		//executa a acao
		chain.doFilter(req, resp);
		
		long depois=System.currentTimeMillis();
		
		System.out.println("Tempo de execuçãlo"+" "+acaoParam+" "+(depois-antes));
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}
	
	

}
