package models.estado;

public class Estado {
	private String uf;
	private String estado;
	
	public Estado(String uf, String estado) {
		super();
		this.uf = uf;
		this.estado = estado;
	}

	public String getUf() {
		return uf;
	}

	public String getEstado() {
		return estado;
	}
	
}
