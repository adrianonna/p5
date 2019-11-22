package model;

public class Jogo2D extends JogoDigital {

	private String dispositivo;
	private int tipoControle;
	
	public Jogo2D(int anoCriacao, String produtora, int idJogo, String nome, int quantidadeJogos, float precoAluguel,
			int quantidadePessoas, String dispositivo, int tipoControle) {
		super(anoCriacao, produtora, idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.dispositivo = dispositivo;
		this.tipoControle = tipoControle;
	}

	public Jogo2D() {}

	public String getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	public int getTipoControle() {
		return tipoControle;
	}

	public void setTipoControle(int tipoControle) {
		this.tipoControle = tipoControle;
	}

	@Override
	public String toString() {
		return "Jogo2D [dispositivo=" + dispositivo + ", tipoControle=" + tipoControle + "]";
	}
	
	
	
}
