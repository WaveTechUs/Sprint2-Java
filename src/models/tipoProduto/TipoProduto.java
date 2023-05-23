package models.tipoProduto;

public class TipoProduto {
	private int id;
	private String descricao;
	
	public TipoProduto(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
