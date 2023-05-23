package models.tipoESG;

public class TipoESG {
	private int id;
	private String descricao;
	
	public TipoESG(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
