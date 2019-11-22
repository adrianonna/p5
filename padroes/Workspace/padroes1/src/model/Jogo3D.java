package model;

public class Jogo3D extends JogoDigital {

	private String console;
	private int tipoControle;
	
	public Jogo3D(int anoCriacao, String produtora, int idJogo, String nome, int quantidadeJogos, float precoAluguel,
			int quantidadePessoas, String console, int tipoControle) {
		super(anoCriacao, produtora, idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.console = console;
		this.tipoControle = tipoControle;
	}

	public Jogo3D() {}
	
	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getTipoControle() {
		return tipoControle;
	}

	public void setTipoControle(int tipoControle) {
		this.tipoControle = tipoControle;
	}

	@Override
	public String toString() {
		return "jogo3D [console=" + console + ", tipoControle=" + tipoControle + "]";
	}
	
	
	
}
