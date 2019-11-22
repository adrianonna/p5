package model;

public class JogoRA extends JogoDigital {

	private String dispositivo;
	private String marcador;
	
	public JogoRA(int anoCriacao, String produtora, int idJogo, String nome, int quantidadeJogos, float precoAluguel,
			int quantidadePessoas, String dispositivo, String marcador) {
		super(anoCriacao, produtora, idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.dispositivo = dispositivo;
		this.marcador = marcador;
	}
	
	public JogoRA() {}

	public String getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	public String getMarcador() {
		return marcador;
	}

	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}

	@Override
	public String toString() {
		return "jogoRA [dispositivo=" + dispositivo + ", marcador=" + marcador + "]";
	}
	
	
	
}
