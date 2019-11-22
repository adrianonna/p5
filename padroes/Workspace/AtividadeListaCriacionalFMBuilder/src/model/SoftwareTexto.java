package model;

public class SoftwareTexto extends Software{
	
	private ArquivoTextoBuilder arquivoTexto;
	
	public SoftwareTexto(String tipoSoftware) {
		super(tipoSoftware);
	}
	
	public ArquivoTextoBuilder getArquivoTexto() {
		return arquivoTexto;
	}
	
	public void setArquivoTexto(ArquivoTextoBuilder arquivoTexto) {
		this.arquivoTexto = arquivoTexto;
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
	public ArquivoTextoBuilder iniciarArquivo(String nome, String path) {
		return new ArquivoTextoBuilder();
	}

}
