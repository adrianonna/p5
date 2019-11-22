package model;

public class SoftwareEmail extends Software{
	
	private ArquivoEmailBuilder arquivoEmail;
	
	public SoftwareEmail(String tipoSoftware) {
		super(tipoSoftware);
	}

	public ArquivoEmailBuilder getArquivoEmail() {
		return arquivoEmail;
	}
	
	public void setArquivoEmail(ArquivoEmailBuilder arquivoEmail) {
		this.arquivoEmail = arquivoEmail;
	}

	@Override
	public String ler() {
		return "Leitura do arquivo: "+this.getArquivoPrototype()+" pelo software: "+this.getTipoSoftware();
	}

	@Override
	public String escrever() {
		return "Edição do arquivo: "+this.getArquivoPrototype()+" pelo software: "+this.getTipoSoftware();
	}

	@Override
	public ArquivoEmailBuilder iniciarArquivo(String nome, String path) {
		return new ArquivoEmailBuilder();
	}

}
