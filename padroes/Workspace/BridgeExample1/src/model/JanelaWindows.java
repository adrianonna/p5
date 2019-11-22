package model;

public class JanelaWindows implements JanelaImplementada{
	
	public JanelaWindows() {}

	public String desenharJanela(String titulo) {
		return(titulo + " - Janela Windows");
		
	}

	public String desenharBotao(String titulo) {
		return(titulo + " - Botao Windows");
		
	}

}
