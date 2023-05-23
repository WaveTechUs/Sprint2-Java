package models.tipoFeedback;

public class TipoFeedback {
	private int id;
	private String descricao;
	
	public TipoFeedback(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public String getFeedback() {
		return this.descricao;
	}
}
