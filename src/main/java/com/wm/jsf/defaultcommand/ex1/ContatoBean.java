package com.wm.jsf.defaultcommand.ex1;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "contatoBeanEx1")
@RequestScoped
public class ContatoBean {	
	
	public void limpar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Limpo"));		
	}
	
	public void novo() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Preparando para nova inserção"));		
	}
	
	public void salvar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Salvo com sucesso!"));
	}
	
	public void remover() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Removido com sucesso!"));
	}
}
