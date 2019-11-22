package model;

public class ArquivoPlanilha extends ArquivoPrototype{

	
	protected ArquivoPlanilha(String nome, String path) {
        this.nome = nome;
        this.path = path;
        this.copy = false;
    }
	
	public ArquivoPlanilha(ArquivoPlanilha arquivoPlanilha) {
		this.nome = arquivoPlanilha.getNome();
		this.path = arquivoPlanilha.getPath();
		this.copy = arquivoPlanilha.getCopy();
	}

	public void setCopy(boolean copy) {
		this.copy = copy;
	}
	
	@Override
	public String ler() {
		return "Estou lendo o arquivo de planilha: "+super.getNome();
	}

	@Override
	public String escrever() {
		return "Estou escrevendo o arquivo de planilha: "+super.getNome();
	}
	
    public ArquivoPrototype clonar() {
    	if (super.getCopy() == true)
    		return new ArquivoPlanilha(this);
    	else return null;
    }

	@Override
	public String toString() {
		return "ArquivoPlanilha [nome=" + nome + ", path=" + path + ", copy=" + copy + ", data=" + data + ", hora="
				+ hora + ", proprietário=" + proprietário + ", email=" + email + "]";
	}

}
