package model;

public class Pontuacao {

	private int pontualcao;
	
	public Pontuacao(int p) {
		this.pontualcao = p;
	}

	public int getPontualcao() {
		return pontualcao;
	}

	public void setPontualcao(int pontualcao) {
		this.pontualcao -= pontualcao;
	}

	@Override
	public String toString() {
		return "Pontuacao [pontualcao=" + pontualcao + "]";
	}
		
}
