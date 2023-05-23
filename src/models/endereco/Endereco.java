package models.endereco;

public class Endereco {
	private int id;
	private String rua;
	private String bairro;
	private String cep;
	private String complemento;
	private String cidade;
	private String estado;
	
	public Endereco(int id, String rua, String bairro, String cep, String complemento, String cidade, String estado) {
		super();
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getEndereco() {
		return rua + " " + complemento + ", " + bairro + " - " + estado;
	}
	
}
