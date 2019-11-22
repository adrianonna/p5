package model;

public class SoftwarePlanilha extends Software{

	private ArquivoPlanilha arquivoPlanilha;
	
	public SoftwarePlanilha(String tipoSoftware, ArquivoPlanilha arquivoPlanilha) {
		super(tipoSoftware, arquivoPlanilha);
	}
	
	public ArquivoPlanilha getArquivoPlanilha() {
		return arquivoPlanilha;
	}

	public void setArquivoPlanilha(ArquivoPlanilha arquivoPlanilha) {
		this.arquivoPlanilha = arquivoPlanilha;
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
