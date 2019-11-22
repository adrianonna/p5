package model;

public class SoftwarePlanilha extends Software{

	private ArquivoPlanilha arquivoPlanilha;
	
	public SoftwarePlanilha(String tipoSoftware) {
		super(tipoSoftware);
	}
	
	public ArquivoPlanilha getArquivoPlanilha() {
		return arquivoPlanilha;
	}
	
	public void setArquivoPlanilha(ArquivoPlanilha arquivoPlanilha) {
		this.arquivoPlanilha = arquivoPlanilha;
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
	public ArquivoPlanilha iniciarArquivo(String nome, String path) {
		return new ArquivoPlanilha(nome, path);
	}
}
