package model;

public class Homem extends Pessoa {

	public Homem(String nome) {
		super(nome);
	}

	public String quemEh() {
		return "Bem vindo Srº "+ super.getNome() +".";
	}

	
	
	
}
