package com.wm.jsf.defaultcommand.ex3;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "contatoCrudBeanEx3")
@ViewScoped
public class ContatoCrudBean {
	
	private static final String ESTADO_PESQUISA = "PESQUISA";
	
	private static final String ESTADO_INSERCAO = "INSERCAO";
	
	private static final String ESTADO_EDICAO = "EDICAO";
	
	private static final String ACAO_SALVAR = "salvarCommandButton";
	
	private static final String ACAO_PESQUISAR = "pesquisarCommandButton";
		
	private String estadoAtual;
	
	private String acaoAtual;
	
	private Contato registro = new Contato();
	
	private List<Contato> lista = new ArrayList<>();
	
	private ContatoService contatoService = new ContatoService();
	
	@PostConstruct
	public void postConstruct() {
		estadoAtual = ESTADO_PESQUISA;
		
		acaoAtual = ACAO_PESQUISAR;
	}
	
	public void pesquisar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Pesquisa feita"));
		
		lista = contatoService.pesquisar();
	}
	
	public void novo() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Preparando para nova inserção"));
		
		estadoAtual = ESTADO_INSERCAO;
		
		acaoAtual = ACAO_SALVAR;
		
		registro = new Contato();
	}
	
	public void editar(Contato registro) {
		this.registro = registro;
		
		estadoAtual = ESTADO_EDICAO;
		
		acaoAtual = ACAO_SALVAR;
	}
	
	public void limpar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Limpo"));
		
		registro = new Contato();
		
		//continua no mesmo estado
	}
	
	public void salvar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Salvo com sucesso!"));
		
		registro = new Contato();
		lista = new ArrayList<>();
		
		estadoAtual = ESTADO_PESQUISA;
		
		acaoAtual = ACAO_PESQUISAR;
	}
	
	public void remover() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Removido com sucesso!"));
		
		registro = new Contato();
		lista = new ArrayList<>();
		
		estadoAtual = ESTADO_PESQUISA;
		
		acaoAtual = ACAO_PESQUISAR;
	}

	public Contato getRegistro() {
		return registro;
	}
	
	public List<Contato> getLista() {
		return lista;
	}

	public String getEstadoAtual() {
		return estadoAtual;
	}
	
	public String getAcaoAtual() {
		return acaoAtual;
	}
}
