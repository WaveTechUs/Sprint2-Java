package models.produto;

import models.cliente.Cliente;
import models.tipoESG.TipoESG;
import models.tipoFeedback.TipoFeedback;
import models.tipoProduto.TipoProduto;

public class Produto {
	private int id;
	private String descricao;
	private TipoProduto fkTipoProduto;

	public Produto(int id, String descricao, TipoProduto fkTipoProduto) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.fkTipoProduto = fkTipoProduto;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
