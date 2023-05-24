package models.cidade;

import models.estado.Estado;

public class Cidade {
	private int id;
	private String cidade;
	private Estado uf;
	
	public Cidade(String cidade, Estado uf) {
		super();
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public String getCidade() {
		return cidade;
	}

}
