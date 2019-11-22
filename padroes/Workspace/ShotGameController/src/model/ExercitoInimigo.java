package model;

public class ExercitoInimigo extends Inimigos {

	String arma;
	Pontuacao pontos;
	
	
	public ExercitoInimigo(int inteligencia, int forca, int estrategia, Pontuacao pontuacao) {
		super(inteligencia, forca, estrategia);
		this.pontos = pontuacao;
	}

	public ExercitoInimigo(int inteligencia, int forca, int estrategia, String arma) {
		super(inteligencia, forca, estrategia);
		this.arma = arma;
	}
	
	public int getInteligencia() {
		return super.getInteligencia();
	}
	
	public int getForca() {
		return super.getForca();
	}
	
	public int getEstrategia() {
		return super.getEstrategia();
	}
	
	public Pontuacao getPontos() {
		return pontos;
	}
	
	public void setPontos(int p) {
		this.pontos.setPontualcao(p);
	}

}
