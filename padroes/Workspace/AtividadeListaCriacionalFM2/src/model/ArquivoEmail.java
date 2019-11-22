package model;

public class ArquivoEmail extends ArquivoPrototype{

	protected ArquivoEmail(String nome, String path) {
        this.nome = nome;
        this.path = path;
        this.copy = false;
    }
	
	public ArquivoEmail(ArquivoEmail arquivoEmail) {
		this.nome = arquivoEmail.getNome();
		this.path = arquivoEmail.getPath();
		this.copy = arquivoEmail.getCopy();
	}
	
	public void setCopy(boolean copy) {
		this.copy = copy;
	}

	@Override
	public String ler() {
		return "Estou lendo o arquivo de email: "+super.getNome();
	}

	@Override
	public String escrever() {
		return "Estou escrevendo o arquivo de email: "+super.getNome();
	}
	
    public ArquivoPrototype clonar() {
    	if (super.getCopy() == true)
    		return new ArquivoEmail(this);
    	else return null;
    }

	@Override
	public String toString() {
		return "ArquivoEmail [nome=" + nome + ", path=" + path + ", copy=" + copy + ", data=" + data + ", hora=" + hora
				+ ", proprietário=" + proprietário + ", email=" + email + "]";
	}
	
}
