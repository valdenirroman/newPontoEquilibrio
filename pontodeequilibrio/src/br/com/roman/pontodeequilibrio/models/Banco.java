 package br.com.roman.pontodeequilibrio.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Integer chaveSequencial=1;
	
	
	static {
		
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("pit stop");
		
		Empresa empresa2= new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("central shop");
		
		empresas.add(empresa1);
		empresas.add(empresa2);
		
		Usuario usuario1 = new Usuario();
		usuario1.setLogin("junior");
		usuario1.setSenha("1234");
		
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("caio");
		usuario2.setSenha("1234");
		
	}


	public  List<Empresa> getEmpresas() {
		return empresas;
	}


	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		empresas.add(empresa);
		
	}


	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it=empresas.iterator();
		while(it.hasNext()) {
				Empresa emp=it.next();
				
				if(emp.getId()==id) {
					it.remove();
			}
		}
	}


	public Empresa buscaPorId(Integer id) {
		for(Empresa empresa : empresas) {
			if(empresa.getId()==id) {
				return empresa;
			}
		}
		return null;
	}


	public Usuario existeUsuario(String login, String senha) {
	
		for(Usuario usuario:usuarios) {
			if(usuario.ehIhual(login, senha)) {
				return usuario;
			}
		}
		return null;
		
	}
	
}
