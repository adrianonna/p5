package model;

public abstract class Software {

	private String tipoSoftware;
	private ArquivoPrototype arquivoPrototype;
	
	public Software(String tipoSoftware, ArquivoPrototype arquivoPrototype) {
		this.tipoSoftware = tipoSoftware;
		this.arquivoPrototype = arquivoPrototype;
	}
	
	public abstract String ler();
	public abstract String escrever();

	public String getTipoSoftware() {
		return tipoSoftware;
	}

	public void setTipoSoftware(String tipoSoftware) {
		this.tipoSoftware = tipoSoftware;
	}

	public ArquivoPrototype getArquivoPrototype() {
		return arquivoPrototype;
	}

	public void setArquivoPrototype(ArquivoPrototype arquivoPrototype) {
		this.arquivoPrototype = arquivoPrototype;
	}

	@Override
	public String toString() {
		return "Software [tipoSoftware=" + tipoSoftware + ", arquivoPrototype=" + arquivoPrototype + "]";
	}
}
