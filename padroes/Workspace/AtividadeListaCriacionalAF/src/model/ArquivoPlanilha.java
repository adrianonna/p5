package model;

public class ArquivoPlanilha extends ArquivoPrototype {
	
	public ArquivoPlanilha(String nome, String path) {
		this.nome = nome;
		this.path = path;
		System.out.println("Arquivo Planilha");
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
		return "ArquivoPlanilha [nome=" + nome + ", path=" + path + "]";
	}

}
