package model;

public class Factory {
	
	public Factory () {}
	
	public Pessoa getPessoa(String genero, String nome) {
		if (genero.equals("homem"))
			return new Homem(nome);
		else if (genero.equals("mulher"))
			return new Mulher(nome);
		else if (genero.equals("indefinido"))
			return new Indefinido(nome);
		else
			return null;
	}

}
