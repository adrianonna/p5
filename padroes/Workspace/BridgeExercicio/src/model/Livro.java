package model;

public class Livro extends Publicacao{

	private String isbn;

	public Livro(Ponte ponte, String titulo, String autor, String isbn) {
		super(ponte, titulo, autor);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public void criar() {
        System.out.println(criandoPublicacao("Publicação Livro"));
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + " Autor: "+ super.getAutor()+ " Título: "+ super.getTitulo() +"]";
	}
}
