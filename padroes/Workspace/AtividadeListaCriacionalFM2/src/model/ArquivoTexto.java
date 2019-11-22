package model;

public class ArquivoTexto extends ArquivoPrototype {

	public ArquivoTexto(String nome, String path) {
        this.nome = nome;
        this.path = path;
        this.copy = false;
    }
	
	protected ArquivoTexto(ArquivoTexto arquivoTexto) {
		this.nome = arquivoTexto.getNome();
		this.path = arquivoTexto.getPath();
		this.copy = arquivoTexto.getCopy();
	}
	
	public void setCopy(boolean copy) {
		this.copy = copy;
	}

	public String ler() {
		return "Estou lendo o arquivo de texto: "+super.getNome();
	}

	public String escrever() {
		return "Estou escrevendo o arquivo de texto: "+super.getNome();
	}
	
    public ArquivoPrototype clonar() {
    	if (super.getCopy() == true)
    		return new ArquivoTexto(this);
    	else return null;
    }

	@Override
	public String toString() {
		return "ArquivoTexto [nome=" + nome + ", path=" + path + ", copy=" + copy + ", data=" + data + ", hora=" + hora
				+ ", proprietário=" + proprietário + ", email=" + email + "]";
	}

}
