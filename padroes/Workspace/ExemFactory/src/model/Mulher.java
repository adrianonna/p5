package model;

public class Mulher extends Pessoa {

	public Mulher(String nome) {
		super(nome);
	}

	public String quemEh() {
		return "Bem vindo Srª "+ super.getNome() +".";
	}

}
