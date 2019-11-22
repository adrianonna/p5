package model;

public abstract class ArquivoPrototype {

	protected String nome;
	protected String path;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public abstract ArquivoPrototype clonar();
	
	public abstract ArquivoPrototype ler();
	
	public abstract ArquivoPrototype escrever();
	
}
