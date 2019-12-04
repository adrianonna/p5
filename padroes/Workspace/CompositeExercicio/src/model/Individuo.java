package model;

public class Individuo extends Participantes{
	
	private int assento;
	private String nome;
	
	public Individuo() {
		super();
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Individuo [assento=" + assento + ", nome=" + nome + "]";
	}

}
