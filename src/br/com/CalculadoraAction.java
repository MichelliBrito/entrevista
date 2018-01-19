package br.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CalculadoraAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		CalculadoraForm calculadoraForm = (CalculadoraForm) form;
		double resultado = 0;
		double n1 = calculadoraForm.getNumero1();
		double n2 = calculadoraForm.getNumero2();
		
		System.out.println("MUDOU BRANCH!!!!!!");
		
		if(calculadoraForm.getOperacao().equals("somar")) {
			System.out.println("entrou em somar");
			resultado =  n1 + n2;
			request.setAttribute("resultado", resultado);
		}else {
			System.out.println("entrou em subtrair");
			resultado = n1 - n2;
			request.setAttribute("resultado", resultado);
		}
		
		return mapping.findForward("calculadora1");
	}

}
