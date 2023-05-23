package models.feedback;

import java.time.LocalDate;

import models.cliente.Cliente;
import models.produto.Produto;
import models.tipoESG.TipoESG;
import models.tipoFeedback.TipoFeedback;

public class Feedback {
	private int id;
	private String mensagem;
	private LocalDate data;
	private Produto fkProduto;
	private TipoFeedback tipoFeedback;
	private TipoESG fkESG;
	private Cliente fkCliente;
	
	public Feedback(int id, String mensagem, LocalDate data, Produto fkProduto, TipoFeedback tipoFeedback,
			TipoESG fkESG, Cliente fkCliente) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.data = data;
		this.fkProduto = fkProduto;
		this.tipoFeedback = tipoFeedback;
		this.fkESG = fkESG;
		this.fkCliente = fkCliente;
	}

	public Feedback(int id, String mensagem, LocalDate data) {
		this.id = id;
		this.mensagem = mensagem;
		this.data = data;
	}

}
