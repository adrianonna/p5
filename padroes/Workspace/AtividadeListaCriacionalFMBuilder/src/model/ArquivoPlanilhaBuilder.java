package model;

public class ArquivoPlanilhaBuilder extends ArquivoBuilder{

	public ArquivoPlanilhaBuilder() {}
	
	@Override
	public void buildNome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildPath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildHora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildProprietario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildAutorizacaoImpressao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildAutorizacaoCopia() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ArquivoBuilder clonar() {
		if (this.getArquivo().getAutoCopia() == true) {
			return new ArquivoPlanilhaBuilder();
		}else return null;
	}

}
