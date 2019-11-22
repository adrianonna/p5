package model;

public abstract class Jogo {

	private int idJogo;
	private String nome;
	private int quantidadeJogos;
	private float precoAluguel;
	private int quantidadePessoas;
	
	public Jogo(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super();
		this.idJogo = idJogo;
		this.nome = nome;
		this.quantidadeJogos = quantidadeJogos;
		this.precoAluguel = precoAluguel;
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public Jogo() {}
	
	public float calcularTotal() {
		return (float) (getPrecoAluguel() / getQuantidadePessoas());
	}
	
	public int getIdJogo() {
		return idJogo;
	}
	public void setIdJogo(int idJogo) {
		this.idJogo = idJogo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeJogos() {
		return quantidadeJogos;
	}
	public void setQuantidadeJogos(int quantidadeJogos) {
		this.quantidadeJogos = quantidadeJogos;
	}
	public float getPrecoAluguel() {
		return precoAluguel;
	}
	public void setPrecoAluguel(float precoAluguel) {
		this.precoAluguel = precoAluguel;
	}
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	@Override
	public String toString() {
		return "Jogo [idJogo=" + idJogo + ", nome=" + nome + ", quantidadeJogos=" + quantidadeJogos + ", precoAluguel="
				+ precoAluguel + ", quantidadePessoas=" + quantidadePessoas + "]";
	}

	
	
	
}
