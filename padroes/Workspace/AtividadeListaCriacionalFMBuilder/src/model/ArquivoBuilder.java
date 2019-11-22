package model;

public abstract class ArquivoBuilder {

	protected Arquivo arquivo;
	 
    public ArquivoBuilder() {
    	arquivo = new Arquivo();
    }
 
    public abstract void buildNome();
 
    public abstract void buildPath();
 
    public abstract void buildData();
 
    public abstract void buildHora();
 
    public abstract void buildProprietario();
    
    public abstract void buildEmail();
    
    public abstract void buildAutorizacaoImpressao();
    
    public abstract void buildAutorizacaoCopia();
    
    public abstract ArquivoBuilder clonar();
 
    public Arquivo getArquivo() {
        return arquivo;
    }	
}
