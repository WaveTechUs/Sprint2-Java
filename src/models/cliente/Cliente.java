package models.cliente;

import models.cidade.Cidade;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private int idade;
	private String rua;
	private String bairro;
	private String cep;
	private String complemento;
	private String numero;
	private Cidade fkCidade;
	
	public Cliente(int id, String nome, String cpf, int idade, Cidade fkEndereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.fkCidade = fkEndereco;
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
		return fkCidade.getCidade();
	}
	
}
