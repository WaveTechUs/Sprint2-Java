package models.cliente;

import models.endereco.Endereco;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private int idade;
	private Endereco fkEndereco;
	
	public Cliente(int id, String nome, String cpf, int idade, Endereco fkEndereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.fkEndereco = fkEndereco;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getFkEndereco() {
		return fkEndereco.getEndereco();
	}
	
}
