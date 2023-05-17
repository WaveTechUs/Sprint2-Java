package models.feedback;

import java.time.LocalDate;

public class Feedback {
	private int id;
	private String mensagem;
	private LocalDate data;
	
	public Feedback(int id, String mensagem, LocalDate data) {
		this.id = id;
		this.mensagem = mensagem;
		this.data = data;
	}

}
