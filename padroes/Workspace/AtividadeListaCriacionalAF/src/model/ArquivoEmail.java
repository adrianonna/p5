package model;

public class ArquivoEmail extends ArquivoPrototype {
	
	public ArquivoEmail(String nome, String path) {
		this.nome = nome;
		this.path = path;
		System.out.println("Arquivo Email");
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
		return "ArquivoEmail [nome=" + nome + ", path=" + path + "]";
	}

}
