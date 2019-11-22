package model;

public class SoftwarePlanilha extends Software{

	private ArquivoPlanilhaBuilder arquivoPlanilha;
	
	public SoftwarePlanilha(String tipoSoftware) {
		super(tipoSoftware);
	}
	
	public ArquivoPlanilhaBuilder getArquivoPlanilha() {
		return arquivoPlanilha;
	}
	
	public void setArquivoPlanilha(ArquivoPlanilhaBuilder arquivoPlanilha) {
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
	public ArquivoPlanilhaBuilder iniciarArquivo(String nome, String path) {
		return new ArquivoPlanilhaBuilder();
	}
}
