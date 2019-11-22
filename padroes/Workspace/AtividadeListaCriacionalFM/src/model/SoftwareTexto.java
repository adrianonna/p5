package model;

public class SoftwareTexto extends Software{
	
	private ArquivoTexto arquivoTexto;
	
	public SoftwareTexto(String tipoSoftware, ArquivoTexto arquivoPrototype) {
		super(tipoSoftware, arquivoPrototype);
	}
	
	public ArquivoTexto getArquivoTexto() {
		return arquivoTexto;
	}

	public void setArquivoTexto(ArquivoTexto arquivoTexto) {
		this.arquivoTexto = arquivoTexto;
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
