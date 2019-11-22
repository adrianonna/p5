package model;

import java.util.List;

public class Espiao extends Inimigos {

	List<String> amigos;
	Pontuacao pontos;
	
	
	public Espiao(int inteligencia, int forca, int estrategia, Pontuacao pontuacao) {
		super(inteligencia, forca, estrategia);
		this.pontos = pontuacao;
		}

	public Espiao(int inteligencia, int forca, int estrategia, List amigos) {
		super(inteligencia, forca, estrategia);
		this.amigos = amigos;
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
