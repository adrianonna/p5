package model;

public class JogoDigital extends Jogo {
	private int anoCriacao;
	private String produtora;
	
	public JogoDigital(int anoCriacao, String produtora, int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.anoCriacao = anoCriacao;
		this.produtora = produtora;
	}
	
	public JogoDigital() {}
	
	public float calcularTotal() {
		return (float) (super.getPrecoAluguel() / super.getQuantidadePessoas());
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	@Override
	public String toString() {
		return "JogoDigital [anoCriacao=" + anoCriacao + ", produtora=" + produtora + "]";
	}

	
	
	
}
