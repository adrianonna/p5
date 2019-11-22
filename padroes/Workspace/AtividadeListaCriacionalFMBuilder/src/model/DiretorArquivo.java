package model;

public class DiretorArquivo {

	protected ArquivoBuilder arquivoBuilder;
	 
    public DiretorArquivo(ArquivoBuilder arquivoBuilder) {
        this.arquivoBuilder = arquivoBuilder;
    }
 
    public void construirArquivo() {
    	arquivoBuilder.buildNome();
    	arquivoBuilder.buildPath();
    	arquivoBuilder.buildData();
    	arquivoBuilder.buildHora();
    	arquivoBuilder.buildProprietario();
    	arquivoBuilder.buildEmail();
    	arquivoBuilder.buildAutorizacaoImpressao();
    	arquivoBuilder.buildAutorizacaoCopia();
    }
 
    public Arquivo getArquivo() {
        return arquivoBuilder.getArquivo();
    }
	
}
