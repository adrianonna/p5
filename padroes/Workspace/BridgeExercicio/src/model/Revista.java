package model;

public class Revista extends Publicacao{

	private String artigo;
	
	public Revista(Ponte publicacao, String titulo, String autor, String artigo) {
		super(publicacao, titulo, autor);
		this.artigo = artigo;
	}

	public String getArtigo() {
		return artigo;
	}
	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}
	
	@Override
	public void criar() {
        System.out.println(criandoPublicacao("Publicação Revista"));
	}

	@Override
	public String toString() {
		return "Revista [artigo=" + artigo + " Autor: "+ super.getAutor()+ " Título: "+ super.getTitulo() +"]";
	}


	
	
}
