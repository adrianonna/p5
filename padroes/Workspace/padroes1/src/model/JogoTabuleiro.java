package model;

public class JogoTabuleiro extends Jogo {
	private String estilo;
	
	public JogoTabuleiro(String estilo, int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.estilo = estilo;
	}
	
	public JogoTabuleiro() {}

	public float calcularTotal() {
		return (float) (super.getPrecoAluguel() / super.getQuantidadePessoas() * 0.9);
	}
	
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "JogoTabuleiro [estilo=" + estilo + "]";
	}
	
	
	
}
