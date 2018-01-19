package br.com;

import org.apache.struts.action.ActionForm;

public class AtlanticForm extends ActionForm {

	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
