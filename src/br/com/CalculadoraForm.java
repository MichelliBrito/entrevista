package br.com;

import org.apache.struts.action.ActionForm;

public class CalculadoraForm extends ActionForm{
	
	private double numero1;
	private double numero2;
	private String operacao = "";
	
	public double getNumero1() {
		return numero1;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	
	
}
