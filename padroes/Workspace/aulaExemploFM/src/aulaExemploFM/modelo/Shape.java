package aulaExemploFM.modelo;

public abstract class Shape {
	
	private String tipo;
	

	public Shape(String tipo) {
		super();
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract String draw();
	
	
	
}
