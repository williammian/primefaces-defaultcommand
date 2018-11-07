package com.wm.jsf.defaultcommand.ex3;

public class Contato {
	
	private Integer id;
	
	private String nome;
	
	private String site;

	public Contato() {
	}
	
	public Contato(Integer id, String nome, String site) {
		this.id = id;
		this.nome = nome;
		this.site = site;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSite() {
		return site;
	}
	
	public void setSite(String site) {
		this.site = site;
	}
}
