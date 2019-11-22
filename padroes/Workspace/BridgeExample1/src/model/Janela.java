package model;

public abstract class Janela {
	private JanelaImplementada janela;
	 
    public Janela(JanelaImplementada j) {
        janela = j;
    }
 
    public String desenharJanela(String titulo) {
        return janela.desenharJanela(titulo);
    }
 
    public String desenharBotao(String titulo) {
        return janela.desenharBotao(titulo);
    }
 
    public abstract void desenhar();
}
