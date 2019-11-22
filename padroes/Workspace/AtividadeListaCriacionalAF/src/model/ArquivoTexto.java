package model;

public class ArquivoTexto extends ArquivoPrototype{
	
	public ArquivoTexto(String nome, String path) {
		this.nome = nome;
		this.path = path;
		System.out.println("Arquivo Texto");
	}

	@Override
	public ArquivoPrototype clonar() {
		return null;
	}

	@Override
	public ArquivoPrototype ler() {
		return null;
	}

	@Override
	public ArquivoPrototype escrever() {
		return null;
	}

	@Override
	public String toString() {
		return "ArquivoTexto [nome=" + nome + ", path=" + path + "]";
	}

}
