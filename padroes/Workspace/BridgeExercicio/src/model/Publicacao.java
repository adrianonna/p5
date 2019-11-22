package model;

public abstract class Publicacao {
	
	protected Ponte ponte;
	
	private String titulo;
	private String autor;
	
	public Publicacao(Ponte ponte, String titulo, String autor) {
		super();
		this.ponte = ponte;
		this.titulo = titulo;
		this.autor = autor;
	}
		
	public Publicacao(Ponte ponte) {
		this.ponte = ponte;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String Autor) {
		this.autor = Autor;
	}
	public Ponte getPonte() {
		return ponte;
	}
	public void setPonte(Ponte ponte) {
		this.ponte = ponte;
	}
	
	public abstract void criar();
	
	public String criandoPublicacao(String string) {
		return ponte.criandoPublicacaoPonte(string);
	}
	
	@Override
	public String toString() {
		return "Publicacao [ponte=" + ponte + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
}
