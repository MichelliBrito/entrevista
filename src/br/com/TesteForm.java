package br.com;

import org.apache.struts.action.ActionForm;

public class TesteForm extends ActionForm{
	
	private String nome = "";
	private String mensagem = "";
	private String acao = "";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	
	

}
