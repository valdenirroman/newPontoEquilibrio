package br.com.roman.pontodeequilibrio.acao;

public class PontoDeEquilibro {

	
	private String nomeEmpresa;
	private double custos;
	private double margemContribuicao;
	
	
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nome) {
		this.nomeEmpresa = nome;
	}
	public double getCustos() {
		return custos;
	}
	public void setCustos(double custos) {
		this.custos = custos;
	}
	
	public double getMargemContribuicao() {
		return margemContribuicao;
	}
	public void setMargemContribuicao(double margemContribuicao) {
		this.margemContribuicao = margemContribuicao;
	}
	
	
	public double calcula(double custos, double margemContribuicao) {	
		
		this.margemContribuicao=margemContribuicao/100;
		double totalPontoEquilibrio= custos/this.margemContribuicao;
		return totalPontoEquilibrio;
	}
	
}
