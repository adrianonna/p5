package model;

public abstract class Software {

	private String tipoSoftware;
	private Arquivo arquivoPrototype;
	
	public Software(String tipoSoftware) {
		this.tipoSoftware = tipoSoftware;
	}

	public abstract String ler();
	public abstract String escrever();

	public String getTipoSoftware() {
		return tipoSoftware;
	}

	public void setTipoSoftware(String tipoSoftware) {
		this.tipoSoftware = tipoSoftware;
	}

	public Arquivo getArquivoPrototype() {
		return arquivoPrototype;
	}

	public void setArquivoPrototype(Arquivo arquivo) {
		this.arquivoPrototype = arquivo;
	}

	@Override
	public String toString() {
		return "Software [tipoSoftware=" + tipoSoftware + ", arquivoPrototype=" + arquivoPrototype + "]";
	}

	public abstract ArquivoBuilder iniciarArquivo(String nome, String path);
}
