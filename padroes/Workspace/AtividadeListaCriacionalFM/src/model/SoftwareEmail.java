package model;

public class SoftwareEmail extends Software{
	
	private ArquivoEmail arquivoEmail;
	
	public SoftwareEmail(String tipoSoftware, ArquivoEmail arquivoPrototype) {
		super(tipoSoftware, arquivoPrototype);
	}

	public ArquivoEmail getArquivoEmail() {
		return arquivoEmail;
	}

	public void setArquivoEmail(ArquivoEmail arquivoEmail) {
		this.arquivoEmail = arquivoEmail;
	}

	@Override
	public String ler() {
		return "Leitura do arquivo: "+super.getArquivoPrototype()+" pelo software: "+super.getTipoSoftware();
	}

	@Override
	public String escrever() {
		return "Edição do arquivo: "+super.getArquivoPrototype()+" pelo software: "+super.getTipoSoftware();
	}

	@Override
	public ArquivoPrototype getArquivoPrototype() {
		return super.getArquivoPrototype();
	}

}
