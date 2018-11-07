package com.wm.jsf.defaultcommand.ex2;

import java.util.Arrays;
import java.util.List;

public class ContatoService {
	
	private static final List<Contato> CONTATOS = Arrays.asList(
				new Contato(1, "Normandes", "http://blog.algaworks.com/author/normandes/"),
				new Contato(2, "Thiago", "http://blog.algaworks.com/author/thiago/"),
				new Contato(3, "Alexandre Afonso", "http://blog.algaworks.com/author/alexandre-afonso/")
			);
	
	public List<Contato> pesquisar() {
		return CONTATOS;
	}
	
	public Contato buscar(Integer id) {
		return CONTATOS.stream()
				.filter(c -> c.getId().equals(id))
				.findFirst()
				.get();
	}
}
