package model;

public class ArquivoTextoBuilder extends ArquivoBuilder{

	public ArquivoTextoBuilder() {}
	
	@Override
	public void buildNome() {
		arquivo.setNome("ArquivoTexto");
	}

	@Override
	public void buildPath() {
		arquivo.setPath("C:ArquivoTexto");
	}

	@Override
	public void buildData() {
		arquivo.setData(null);
	}

	@Override
	public void buildHora() {
		arquivo.setHora(null);
	}

	@Override
	public void buildProprietario() {
		arquivo.setProprietario(null);
	}

	@Override
	public void buildEmail() {
		arquivo.setEmail(null);
	}

	@Override
	public void buildAutorizacaoImpressao() {
		arquivo.setAutoImpressao(false);
	}

	@Override
	public void buildAutorizacaoCopia() {
		arquivo.setAutoCopia(false);
	}
	
	@Override
	public ArquivoBuilder clonar() {
		if (this.getArquivo().getAutoCopia() == true) {
			return new ArquivoTextoBuilder();
		}else return null;
	}

}
