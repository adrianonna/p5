package model;

public class SoftwareTexto extends Software{
	
	private ArquivoTexto arquivoTexto;
	
	public SoftwareTexto(String tipoSoftware) {
		super(tipoSoftware);
	}
	
	public ArquivoTexto getArquivoTexto() {
		return arquivoTexto;
	}
	
	public void setArquivoTexto(ArquivoTexto arquivoTexto) {
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
	public ArquivoTexto iniciarArquivo(String nome, String path) {
		return new ArquivoTexto(nome, path);
	}

}
