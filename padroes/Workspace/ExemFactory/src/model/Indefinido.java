package model;

public class Indefinido extends Pessoa {

	public Indefinido(String nome) {
		super(nome);
	}

	public String quemEh() {
		return "Bem vindx "+ getNome() +".";
	}
	
}
