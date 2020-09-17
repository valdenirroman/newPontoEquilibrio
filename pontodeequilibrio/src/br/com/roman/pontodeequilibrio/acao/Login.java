package br.com.roman.pontodeequilibrio.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.roman.pontodeequilibrio.models.Banco;
import br.com.roman.pontodeequilibrio.models.Usuario;

public class Login implements Acao{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String login=req.getParameter("login");
		String senha=req.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario= banco.existeUsuario(login,senha);
		
		if(usuario!=null) {
			System.out.println("usuario existe");
			HttpSession sessao=req.getSession();
			sessao.setAttribute("usuarioLogado",usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			return "redirect:entrada?acao=LoginForm";
			
			
	}
		
	}

}
