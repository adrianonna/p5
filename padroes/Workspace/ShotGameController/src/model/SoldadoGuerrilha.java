package model;

public class SoldadoGuerrilha extends Inimigos {
	
	String armadura;
	Pontuacao pontos;
	
	public SoldadoGuerrilha(int inteligencia, int forca, int estrategia, Pontuacao pontuacao) {
		super(inteligencia, forca, estrategia);
		this.pontos = pontuacao;
	}

	public SoldadoGuerrilha(int inteligencia, int forca, int estrategia, String armadura) {
		super(inteligencia, forca, estrategia);
		this.armadura = armadura;
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

	@Override
	public String toString() {
		return "SoldadoGuerrilha [armadura=" + armadura + ", pontos=" + pontos + "]";
	}
	
	
	
}
