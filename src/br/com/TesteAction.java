package br.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TesteAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		TesteForm testeForm = (TesteForm) form;
		testeForm.setMensagem("Olá!!");
		request.setAttribute("nomeUsuario", testeForm.getNome());
		
		return mapping.findForward("teste1");
	}

}
