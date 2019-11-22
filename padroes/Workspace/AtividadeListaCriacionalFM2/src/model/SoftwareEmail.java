package model;

public class SoftwareEmail extends Software{
	
	private ArquivoEmail arquivoEmail;
	
	public SoftwareEmail(String tipoSoftware) {
		super(tipoSoftware);
	}

	public ArquivoEmail getArquivoEmail() {
		return arquivoEmail;
	}
	
	public void setArquivoEmail(ArquivoEmail arquivoEmail) {
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
	public ArquivoEmail iniciarArquivo(String nome, String path) {
		return new ArquivoEmail(nome, path);
	}

}
